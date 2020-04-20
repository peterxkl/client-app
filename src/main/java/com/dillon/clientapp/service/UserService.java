package com.dillon.clientapp.service;

import com.dillon.clientapp.pojo.User;
import com.dillon.clientapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DillonXie
 * @version 1.0
 * @date 2020/4/19 21:09
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        return user;
    }
}
