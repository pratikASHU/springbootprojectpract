package com.javatechpractice.springbootprojectpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String user() {
        System.out.println("This is home page");
        return "user";
    }
}
