package com.myweb.controller;

import com.myweb.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private UserFeign userFeign;
    @RequestMapping("order")
    public String get(){
        return userFeign.getUserService();
    }
}
