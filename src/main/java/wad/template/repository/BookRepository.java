/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.template.domain.Book;

/**
 *
 * @author sakus
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
