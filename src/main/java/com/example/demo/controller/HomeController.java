package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value="/")
public class HomeController {

	@RequestMapping
	public String showHome() {
		return "home";
	}
	
}
