package com.rd.demo.simpleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleRestController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Sir...";
	}
	@GetMapping("")
	public String getDefaultMessage() {
		return "No messages available";
	}
	
}
