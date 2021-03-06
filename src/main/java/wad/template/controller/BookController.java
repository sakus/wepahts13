/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.controller;

import java.util.List;
import javax.validation.Valid;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import wad.template.domain.Book;
import wad.template.domain.BookUser;
import wad.template.service.BookService;
import wad.template.service.UserService;

/**
 *
 * @author sakus
 */
@Controller
public class BookController {
    
    @Autowired
    private BookService bookService = new BookService();
    
    @Autowired
    private UserService userService = new UserService();
    
    // listaa kannassa olevat kirjat
    @RequestMapping(value = "books", method = RequestMethod.GET)
    public String listBooks(Model model, @RequestParam(value = "msg", defaultValue = "") String msg) {
        
        model.addAttribute("books", bookService.listBooks());
        model.addAttribute("msg", msg);
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String loggedInUser = auth.getName();
        model.addAttribute("loggedin", loggedInUser);
        
        model.addAttribute("listingTitle", "all books in the db");
        
        return "books";
        
    }
    
    // hoitaa uuden kirjan lisaamisen
    @RequestMapping(value = "addbook", method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute Book book, BindingResult bindingResult, Model model) {
        
        if (!bindingResult.hasErrors()) {
            
            bookService.saveBook(book);
            model.addAttribute("msg", "the book <strong>" + book.getBookTitle() + "</strong> was added");
            return "redirect:/app/books";
        }
        
        else {
            model.addAttribute("msg", "the book wasn't added, check your input");
            return "redirect:/app/addbook";
        }
        
    }
    
    // nayttaa formin kirjan lisaamiselle
    @RequestMapping(value = "addbook", method = RequestMethod.GET)
    public String showAddBookForm(@ModelAttribute("book") Book book, @RequestParam(value = "msg", defaultValue = "") String msg, Model model) {
        
        model.addAttribute("msg", msg);
        return "addbook";
        
    }
    
    // noukkii kirjan tiedot ISBN:n perusteella openlibrarysta
    @RequestMapping(value = "populate", method = RequestMethod.POST)
    public String populateBook(@ModelAttribute Book book, Model model) throws Exception {
        
        // isbn on annettu ainakin jossain moudossa, koitetaan siis loytyyko silla jotain
        if (book.getBookISBN() != null && !book.getBookISBN().equals("")) {
            
            // napataan tietoa openlibrarysta
            RestTemplate restTemplate = new RestTemplate();
            String request = "http://openlibrary.org/api/books?bibkeys=ISBN:" + book.getBookISBN() + "&format=json&jscmd=data";
            String response = restTemplate.getForObject(request, String.class);
            
            // koitetaan parseta sita sekamelskaa jotenkin
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(response);
            JSONObject obj1 = (JSONObject)obj;
            JSONObject obj2 = (JSONObject)obj1.get("ISBN:" + book.getBookISBN());
            
            // jos ei tullut mitaan fiksua niin voitais tassa vaiheessa heittaa kayttaja bumerangina takasin formiin
            if (obj2 == null) {
                Book newBook = new Book();
                model.addAttribute("book", newBook);
                model.addAttribute("msg", "couldn't find anything from open library by this isbn");
                return "addbook";
            }
            
            // muuten aletaan iskemaan tietoja paikalleen
            book.setBookTitle((String)obj2.get("title"));
            book.setBookPublishingYear((String)obj2.get("publish_date"));
            
            // authorit.. kokkoa mutta minkas teet
            JSONArray arr1 = (JSONArray)obj2.get("authors");
            
            if (arr1 != null) {
                
                JSONObject obj3 = (JSONObject)arr1.get(0);
                book.setBookAuthor1((String)obj3.get("name"));

                if (arr1.size() >= 2) {
                    obj3 = (JSONObject)arr1.get(1);
                    book.setBookAuthor2((String)obj3.get("name"));
                }

                if (arr1.size() >= 3) {
                    obj3 = (JSONObject)arr1.get(2);
                    book.setBookAuthor3((String)obj3.get("name"));
                }

                if (arr1.size() >= 4) {
                    obj3 = (JSONObject)arr1.get(3);
                    book.setBookAuthor4((String)obj3.get("name"));
                }

                if (arr1.size() >= 5) {
                    obj3 = (JSONObject)arr1.get(4);
                    book.setBookAuthor5((String)obj3.get("name"));
                }

            }
            
            // ei yhtakaan authoria openlibraryn mukaan syysta tahi toisesta
            else {
                book.setBookAuthor1("N/A");
            }
            
            // publisherit
            arr1 = (JSONArray)obj2.get("publishers");
            if (arr1 != null) {
                
                // eka
                JSONObject obj3 = (JSONObject)arr1.get(0);
                book.setBookPublisher1((String)obj3.get("name"));
                
                // toka
                if (arr1.size() >= 2) {
                    obj3 = (JSONObject)arr1.get(1);
                    book.setBookPublisher2((String)obj3.get("name"));  
                }
                
            }
            
            // ei publishereita OL:ssa, isketaan N/A
            else {
                book.setBookPublisher1("N/A");
            }
            
            // kansikuvat
            JSONObject obj3 = (JSONObject)obj2.get("cover");
            if (obj3 != null) {
                
                // openlibrarysta jos loytyy, muuten "N/A" -kuva
                String small = (String)obj3.get("small");
                if (small != null && !small.equals(""))
                    book.setBookCoverThumbnailURL(small);
                else
                    book.setBookCoverThumbnailURL("/img/na_thumbnail.png");
                
                String large = (String)obj3.get("large");
                if (large != null && !large.equals(""))
                    book.setBookCoverFullURL(large);
                else
                    book.setBookCoverFullURL("/img/na_largecover.png");
            }
            
            // ei loydy mitaan, molempiin suoraan N/A
            else {
                book.setBookCoverThumbnailURL("/img/na_thumbnail.png");
                book.setBookCoverFullURL("/img/na_largecover.png");
            }
            
            // viedaan kantaan tassa vaiheessa, etta saadaan kirjalle id
            book = bookService.saveBook(book);
            
            // lisataan valmis kirja modeliin ja ohjataan juuri lisatyn kirjan tietoihin
            model.addAttribute("msg", "the book was saved with the information fetched from open library");
            model.addAttribute("book", book);
            return "book";
            
        }
        
        // oli vaan hakattu populate-nappia syottamatta ISBN:aa, palataan samantien takasin formiin
        else
            return "addbook";
        
    }
    
    // nayttaa yksittaisen kirjan tiedot
    @RequestMapping(value = "books/{id}", method = RequestMethod.GET)
    public String showBook(@PathVariable Long id, Model model, @RequestParam(value = "msg", defaultValue = "") String msg) {
        
        Book wantedBook = bookService.getBookById(id);
        model.addAttribute("book", wantedBook);
        model.addAttribute("msg", msg);
        return "book";
        
    }
    
    // poistaa kirjan kannasta
    @RequestMapping(value = "rembook/{id}", method = RequestMethod.POST)
    public String removeBook(@PathVariable Long id, Model model) {
        
        Book deletedBook = bookService.deleteBook(id);
        model.addAttribute("msg", "the book " + deletedBook.getBookTitle() + " was deleted");
        return "redirect:/app/books";
        
    }
    
    // tallennetaan kirjan muutetut tiedot jos ne on valideja (ei tsekkaa onko tiedot oikeasti muuttuneet vai ei)
    @RequestMapping(value = "savebook/{id}", method = RequestMethod.POST)
    public String editBook(@Valid @ModelAttribute Book book, BindingResult bindingResult, Model model, @PathVariable Long id) {
        
        if (!bindingResult.hasErrors()) {
            book.setBookId(id);
            bookService.saveBook(book);
            model.addAttribute("msg", "information saved");
            return "redirect:/app/books/" + id;
        }
        
        else {
            model.addAttribute("msg", "information not changed");
            return "redirect:/app/books/" + id;
        }
        
    }
    
    // login - spring hoitaa, otetaan vian kayttoon polku sita varten - tahan polkuun on maaritelty vaatimus
    // sisaankirjautumisesta jolloin spring astuu kuvaan ja kyselee tunnuksia
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String dologin() {
    
            return "redirect:/app/books";
            
    }
    
    @RequestMapping(value="register", method = RequestMethod.GET)
    public String showRegisterForm(Model model, @RequestParam(value = "msg", defaultValue = "") String msg) {
    
        model.addAttribute("msg", msg);
        return "register";
        
    }
    
    // rekisteroi uuden kayttajan, jos annetut tiedot on kunnossa
    @RequestMapping(value="register", method = RequestMethod.POST)
    public String doRegister(Model model, @RequestParam(value = "userName", defaultValue = "") String userName, 
        @RequestParam(value = "password1", defaultValue = "") String password1, 
        @RequestParam(value = "password2", defaultValue = "") String password2) {
        
        // lahdetaan olettamuksesta, etta kayttajanimi on kelpo..
        boolean userNameIsOK = true;
        
        // .. mutta jos se on tyhja, ei kelpaa ..
        if (userName.equals(""))
            userNameIsOK = false;
        
        // .. eika kelpaa jos on liian lyhyt ..
        if (userName.length() < 4)
            userNameIsOK = false;
        
        // .. paastiin lapi tyhjan ja lyhyen nimen tsekista, katsotaan ettei se ole jo kaytossa
        if (userNameIsOK) {
            List<BookUser> allUsers = userService.listUsers();
            for (BookUser user : allUsers) {
                if (user.getUserName().equals(userName))
                    userNameIsOK = false;
            }
        }
        
        // nimi oli kunnossa ja passutkin matsaa joten luodaan kayttaja
        if (userNameIsOK && !password1.equals("") && password1.equals(password2)) {
         
            BookUser newUser = new BookUser();
            newUser.setUserName(userName);
            
            // passu hashataan sha-ykkosella ja suolataan timestampilla ennen kantaan viemista
            newUser.setUserSalt(System.currentTimeMillis());
            MessageDigestPasswordEncoder encoder = new MessageDigestPasswordEncoder("SHA-1");
            String hash = encoder.encodePassword(password1, newUser.getUserSalt());
            newUser.setUserPassword(hash);
            
            userService.saveUser(newUser);
            
            model.addAttribute("msg", "user " + userName + " added, you can now log in");
            
            return ("redirect:/app/books");
            
        }
        
        else {
            
            String errorMessage = "Error(s) with registering: ";

            if (userName.equals(""))
                errorMessage += "The username must not be empty. ";
            if (!userName.equals("") && userName.length() >= 4 && !userNameIsOK)
                errorMessage += "The username is already in use. ";
            if (userName.length() < 4 && !userName.equals(""))
                errorMessage += "The username must be a minimum of 4 characters long. ";
            if (password1.equals("") && password2.equals(""))
                errorMessage += "The password cannot be empty. ";
            if (!password1.equals(password2))
                errorMessage += "The passwords must match. ";
   
            model.addAttribute("msg", errorMessage);
            
        }
   
        return "redirect:/app/register";
        
    }
    
    @RequestMapping(value="search",  method = RequestMethod.POST)
    public String search(Model model, @RequestParam(value = "searchQuery", defaultValue = "") String searchQuery) {
        
        List<Book> foundBooks = bookService.searchBookByName(searchQuery);
        model.addAttribute("books", foundBooks);
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String loggedInUser = auth.getName();
        model.addAttribute("loggedin", loggedInUser);
        
        model.addAttribute("listingTitle", "search results");
        
        return "books";
        
    }
}
