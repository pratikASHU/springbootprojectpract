package com.javatechpractice.springbootprojectpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/profile/user")
    public String profile() {
        System.out.println("This is home page");
        return "profile/user";
    }
    @RequestMapping("/profile/home")
    public String home() {
        System.out.println("This is home page");
        return "profile/home";
    }

     @RequestMapping("/profile/details")
    public String details() {
        System.out.println("This is details page");
        return "profile/details";
    }

    @RequestMapping("/profile/user")
    public String user() {
        System.out.println("This is user page");
        return "profile/user";
    }

}
