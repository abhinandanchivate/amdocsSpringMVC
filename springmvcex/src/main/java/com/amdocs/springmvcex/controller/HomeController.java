package com.amdocs.springmvcex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	@RequestMapping(path="/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	@RequestMapping(path="/register", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute Employee employee) {
		
		System.out.println(employee);
		return "login";
	}
	
}
