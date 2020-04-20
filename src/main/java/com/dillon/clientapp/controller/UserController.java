package com.dillon.clientapp.controller;

import com.dillon.clientapp.pojo.User;
import com.dillon.clientapp.reponse.CommonReturnType;
import com.dillon.clientapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DillonXie
 * @version 1.0
 * @date 2020/4/19 21:08
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public CommonReturnType login(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        log.info("username is {}, password is {}", username, password);
        User user1 = userService.login(username, password);
        if (user1 == null) {
            return CommonReturnType.create(null, "fail");
        }
        return CommonReturnType.create(user1, "success");
    }

    @PostMapping("/signout")
    public CommonReturnType signout(String username, String password) {
        User user = userService.login(username, password);
        if (user == null) {
            return CommonReturnType.create(null, "fail");
        }
        return CommonReturnType.create(user, "success");
    }
}
