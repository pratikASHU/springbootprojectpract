package com.javatechpractice.springbootprojectpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("This is home page");
		return "home";
	}

	@RequestMapping("/profile")
	public String profile() {
		System.out.println("This is home page");
		return "profile";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("This is contact page");
		System.out.println("Hello");
		return "contact";
	}
}
