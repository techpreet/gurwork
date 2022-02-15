package com.gur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello-mvc")
	public String hello() {
		System.out.println("Hello Controller called...");
		return "hello";
	}
}