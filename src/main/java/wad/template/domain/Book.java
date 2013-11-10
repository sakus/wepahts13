/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author sakus
 */
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    
    @NotBlank
    private String bookTitle;
    
    @NotBlank
    private String bookISBN;
    
    @NotNull
    private String bookPublishingYear;
    
    // authorit on nyt kiinteesti niin formit jne oli helpompi tehda
    @NotBlank
    private String bookAuthor1;
    
    private String bookAuthor2;
    private String bookAuthor3;
    private String bookAuthor4;
    private String bookAuthor5;
    
    private String bookCoverThumbnailURL;
    private String bookCoverFullURL;
    
    @NotBlank
    private String bookPublisher1;
    
    private String bookPublisher2;
    
    public Long getBookId() {    
        return this.bookId;
    }
    
    public void setBookId(Long newId) {
        this.bookId = newId;
    }
 
    public String getBookTitle() {
        return this.bookTitle;
    }
    
    public void setBookTitle(String newTitle) {
        this.bookTitle = newTitle;
    }
    
    public String getBookISBN() {
        return this.bookISBN;
    }
    
    public void setBookISBN(String newISBN) {
        this.bookISBN = newISBN;
    }    

    public String getBookPublishingYear() {
        return this.bookPublishingYear;
    }
    
    public void setBookPublishingYear(String year) {
        this.bookPublishingYear = year;
    }
    
    public String getBookAuthor1() {
        return this.bookAuthor1;
    }
    
    public void setBookAuthor1(String author) {
        this.bookAuthor1 = author;
    }
    
    public String getBookAuthor2() {
        return this.bookAuthor2;
    }
    
    public void setBookAuthor2(String author) {
        this.bookAuthor2 = author;
    }
        
    public String getBookAuthor3() {
        return this.bookAuthor3;
    }
    
    public void setBookAuthor3(String author) {
        this.bookAuthor3 = author;
    }
        
    public String getBookAuthor4() {
        return this.bookAuthor4;
    }
    
    public void setBookAuthor4(String author) {
        this.bookAuthor4 = author;
    }
            
    public String getBookAuthor5() {
        return this.bookAuthor5;
    }
    
    public void setBookAuthor5(String author) {
        this.bookAuthor5 = author;
    }
     
    public void setBookPublisher1(String publisher) {
        this.bookPublisher1 = publisher;
    }
    
    public String getBookPublisher1() {
        return this.bookPublisher1;
    }
    
    public void setBookPublisher2(String publisher) {
        this.bookPublisher2 = publisher;
    }
    
    public String getBookPublisher2() {
        return this.bookPublisher2;
    }
    
    public void setBookCoverThumbnailURL(String URL) {
        this.bookCoverThumbnailURL = URL;
    }
    
    public String getBookCoverThumbnailURL() {
        return this.bookCoverThumbnailURL;
    }
    
    public void setBookCoverFullURL(String URL) {
        this.bookCoverFullURL = URL;
    }
    
    public String getBookCoverFullURL() {
        return this.bookCoverFullURL;
    }
    
}
