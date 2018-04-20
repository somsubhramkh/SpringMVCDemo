package com.niit.springwebexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.springwebexample.domain.HelloWorld;

@Controller
public class HelloController {

	@Autowired
	private HelloWorld helloWorld;
	
	
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("hello", helloWorld.sayHello());
		return "index";
	}
	
}
