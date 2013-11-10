package wad;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tests {

    private String port;
    private WebDriver driver;
    private String baseAddress;
    private WebElement element;
    
    @Before
    public void setUp() {
        
        driver = new HtmlUnitDriver();
        port = System.getProperty("jetty.port", "8090");
        baseAddress = "http://localhost:" + port + "/app";
    }
         
    @Test
    public void testAllInOne() {
        
        // klikataan register-linkkiä ja varmistetaan, että päädytään rekisteröintiformiin..
        driver.get(baseAddress);
        driver.findElement(By.linkText("register")).click();
        Assert.assertTrue(driver.getPageSource().contains("register a new user account"));
        
        // koitetaan rekisteröidä liian lyhyt tunnus ja varmistetaan, että lopputuloksena on virheilmoitus
        element = driver.findElement(By.name("userName"));
        element.sendKeys("sak");
        element = driver.findElement(By.name("password1"));
        element.sendKeys("testipassu");
        element = driver.findElement(By.name("password2"));
        element.sendKeys("testipassu");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("The username must be a minimum of 4 characters long."));
        
        // tarpeeksi pitkä tunnus mutta tyhjä salasana
        element = driver.findElement(By.name("userName"));
        element.sendKeys("sakus");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("The password cannot be empty."));
        
        // tunnus kunnossa mutta salasanakentät ei mätsää
        element = driver.findElement(By.name("userName"));
        element.sendKeys("sakus");
        element = driver.findElement(By.name("password1"));
        element.sendKeys("testipassu");
        element = driver.findElement(By.name("password2"));
        element.sendKeys("testipasdu");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("The passwords must match."));
        
        // onnistunut tunnuksen luonti
        element = driver.findElement(By.name("userName"));
        element.sendKeys("sakus");
        element = driver.findElement(By.name("password1"));
        element.sendKeys("testipassu");
        element = driver.findElement(By.name("password2"));
        element.sendKeys("testipassu");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("user sakus added, you can now log in"));
     
        // koitetaan luoda tjunnus joka on jo olemassa, ei saa onnistua..
        driver.findElement(By.linkText("register")).click();
        element = driver.findElement(By.name("userName"));
        element.sendKeys("sakus");
        element = driver.findElement(By.name("password1"));
        element.sendKeys("testipassu2");
        element = driver.findElement(By.name("password2"));
        element.sendKeys("testipassu2");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("The username is already in use."));
     
        // koitetaan kirjautua sisään luodulla tunnuksella
        driver.findElement(By.linkText("back to book listing")).click();
        driver.findElement(By.linkText("log in")).click();
        element = driver.findElement(By.name("j_username"));
        element.sendKeys("sakus");
        element = driver.findElement(By.name("j_password"));
        element.sendKeys("testipassu");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("log out (sakus)"));
        
        // log out
        driver.findElement(By.linkText("log out (sakus)")).click();
        Assert.assertTrue(driver.getPageSource().contains("log in"));
        
        // kirjaudutaan takaisin sisään ja lisätään kirja open librarystä
        driver.findElement(By.linkText("log in")).click();
        element = driver.findElement(By.name("j_username"));
        element.sendKeys("sakus");
        element = driver.findElement(By.name("j_password"));
        element.sendKeys("testipassu");
        element.submit();

        driver.findElement(By.linkText("add book")).click();
        element = driver.findElement(By.name("bookISBN"));
        element.sendKeys("0596514824");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("the book was saved with the information fetched from open library"));
        Assert.assertTrue(driver.getPageSource().contains("Head First C# (Head First)"));
        
        // käydään katsomassa, että kirja on oikeasti tallentunut kantaan palaamalla listausnäkymään
        driver.findElement(By.linkText("back to book listing")).click();
        Assert.assertTrue(driver.getPageSource().contains("ISBN: 0596514824"));
        
        // sitten tuhotaan kirja ja katsotaan että se oikeasti tuhoutui
        driver.findElement(By.linkText("Head First C# (Head First)")).click();
        driver.findElement(By.name("deleteBook")).click();
        Assert.assertTrue(driver.getPageSource().contains("the book Head First C# (Head First) was deleted"));
        Assert.assertFalse(driver.getPageSource().contains("ISBN: 0596514824"));
        
        // manuaalinen lisäys puutteellisilla tiedoilla
        driver.findElement(By.linkText("add book")).click();
        element = driver.findElement(By.name("bookTitle"));
        element.sendKeys("testiKirja");
        element.submit();
        Assert.assertTrue(driver.getPageSource().contains("the book wasn't added, check your input"));

        /*
        // manuaalinen lisäys jonka pitäisi onnistua
        element = driver.findElement(By.name("bookTitle"));
        element.sendKeys("testiKirja");
        //element = driver.findElement(By.id("bookISBNmanual"));
        List<WebElement> elementList = driver.findElements(By.name("bookISBN"));
        elementList.get(1).sendKeys("testiISBN");
        element = driver.findElement(By.name("bookPublishingYear"));
        element.sendKeys("testiPublished");
        element = driver.findElement(By.name("bookPublisher1"));
        element.sendKeys("testiPublisher1");
        element = driver.findElement(By.name("bookAuthor1"));
        element.sendKeys("testiAuthor1");
        //element.submit();
        driver.findElement(By.name("addBook")).click();
        Assert.assertTrue(driver.getPageSource().contains("the book testiKirja was added"));
       */
        
    }
    
}
