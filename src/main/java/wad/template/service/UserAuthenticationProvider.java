/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.template.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import wad.template.domain.BookUser;

/**
 *
 * @author sakus
 */
@Service
public class UserAuthenticationProvider implements AuthenticationProvider {
    
    @Autowired
    UserService userService;
    
    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {
        
        String username = auth.getName();
        String password = auth.getCredentials().toString();
        
        // kaydaan lapi kaikki kayttajatunnukset
        for (BookUser user : userService.listUsers()) {
            
            // salasanat on kannassa hash+suolattuna
            MessageDigestPasswordEncoder encoder = new MessageDigestPasswordEncoder("SHA-1");
            String hash = encoder.encodePassword(password, user.getUserSalt());
            
            // jos kannasta loytyy kayttaja jossa seka nimi etta passu matsaa, logataan kys. kayttaja sisaan
            if (user.getUserName().equals(username) && user.getUserPassword().equals(hash)) {
                List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
                grantedAuths.add(new SimpleGrantedAuthority("registeredUser"));
                return new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
            }
            
        }
        
        throw new BadCredentialsException("wrong username or password");
        
    }

    @Override
    public boolean supports(Class authType) {
        return authType.equals(UsernamePasswordAuthenticationToken.class);
    }
}