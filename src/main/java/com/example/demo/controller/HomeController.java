package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(value = "/", method = { RequestMethod.GET })

public class HomeController {

	@RequestMapping
	public String showHome() {
		
		System.out.println(this);
		
		return "home";
	}
	
}
