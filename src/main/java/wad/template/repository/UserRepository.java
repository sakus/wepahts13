/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.template.domain.BookUser;


/**
 *
 * @author sakus
 */
public interface UserRepository extends JpaRepository<BookUser, Long> {
    
}
