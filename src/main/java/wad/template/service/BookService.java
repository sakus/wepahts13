/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.template.domain.Book;
import wad.template.repository.BookRepository;

/**
 *
 * @author sakus
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<Book> listBooks() {
        
        return bookRepository.findAll();
        
    }
    
    @Transactional(readOnly = true)
    public Book getBookById(Long id) {
        
        Book foundBook = bookRepository.findOne(id);
        return foundBook;
        
    }
    
    @Transactional(readOnly = false)
    public Book saveBook(Book newBook) {
        
        return bookRepository.save(newBook);
        
    }
    
    @Transactional(readOnly = false)
    public Book deleteBook(Long id) {
        
        Book deletedBook = bookRepository.findOne(id);
        bookRepository.delete(id);
        return deletedBook;
        
    }
    
}
