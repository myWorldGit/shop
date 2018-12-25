package com.myweb.api.user;


import org.springframework.web.bind.annotation.RequestMapping;

public interface UserService {
    @RequestMapping("/user")
    public String getUserService();
}
