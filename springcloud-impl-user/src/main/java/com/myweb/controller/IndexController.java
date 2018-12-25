package com.myweb.controller;

import com.myweb.api.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements UserService {

    @RequestMapping("/user")
    @Override
    public String getUserService() {
        return "user info ....";
    }
}
