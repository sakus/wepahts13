/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.template.domain.BookUser;
import wad.template.repository.UserRepository;

/**
 *
 * @author sakus
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @PersistenceContext
    private EntityManager entityManager;

    
    @Autowired
    @Transactional(readOnly = false)
    public void makeshiftConstructor() throws Exception {
        
        BookUser newUser = new BookUser();
        newUser.setUserName("testi");
        newUser.setUserSalt(System.currentTimeMillis());
        MessageDigestPasswordEncoder encoder = new MessageDigestPasswordEncoder("SHA-1");
        String hash = encoder.encodePassword("testi", newUser.getUserSalt());
        newUser.setUserPassword(hash);
        userRepository.save(newUser);

        newUser = new BookUser();
        newUser.setUserName("testi2");
        newUser.setUserSalt(System.currentTimeMillis());
        encoder = new MessageDigestPasswordEncoder("SHA-1");
        hash = encoder.encodePassword("testi2", newUser.getUserSalt());
        newUser.setUserPassword(hash);
        userRepository.save(newUser);
        
    }
    

    @Transactional(readOnly = true)
    public List<BookUser> listUsers() {
        return userRepository.findAll();
 
    }
    
    @Transactional(readOnly = true)
    public BookUser getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Transactional(readOnly = false)
    public BookUser saveUser(BookUser user) {
        
        return userRepository.save(user);
        
    }
    
}
