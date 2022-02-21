package com.exampleJenkins.demoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@GetMapping("/welcome")
	public String hello() {
		return"hek=llo jenkins";
	}

}
