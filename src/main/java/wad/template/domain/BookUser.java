/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author sakus
 */

@Entity
public class BookUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;
    
    @NotBlank
    String userName;
    
    @NotBlank
    String userPassword;
    
    String userEmail;
    
    Long userSalt;
    
    public void setUserId(Long id) {
        this.userId = id;
    }
    
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserName(String name) {
        this.userName = name;
    }
    
    public String getUserName() {
        return this.userName;
    }

    public void setUserPassword(String password) {
        this.userPassword = password;
    }
    
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserEmail(String email) {
        this.userEmail = email;
    }
    
    public String getUserEmail() {
        return this.userEmail;
    }
 
    public void setUserSalt(Long salt) {
        this.userSalt = salt;
    }
    
    public Long getUserSalt() {
        return this.userSalt;
    }
    
}
