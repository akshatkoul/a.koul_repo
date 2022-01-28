package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "hello")
	public String hello () {
		return "Hello world !!!! this is a simple spring boot application ";
	}

}
