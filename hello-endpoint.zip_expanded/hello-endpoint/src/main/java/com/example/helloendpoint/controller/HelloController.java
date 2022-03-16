package com.example.helloendpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// rest methods
	
	//@PostMapping
	//@PutMapping
	//@DeleteMapping
	//@GetMapping
		
	@GetMapping("hello")
	public String hello() {
		return "Hello to the first GET endpoint";
	}
	
}
