package com.annakhuseinova.springmarket.services;


import com.annakhuseinova.springmarket.entities.SystemUser;
import com.annakhuseinova.springmarket.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String username);
    boolean save(SystemUser systemUser);

}
