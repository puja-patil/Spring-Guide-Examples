package com.spring.guide.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/home")
	String home() {
		return "home";
	}

	@RequestMapping("/hello")
	String hello() {
		return "hello";
	}

	@RequestMapping("/login")
	String login() {
		return "login";
	}
}
