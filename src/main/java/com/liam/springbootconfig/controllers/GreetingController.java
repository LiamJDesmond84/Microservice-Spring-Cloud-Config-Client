package com.liam.springbootconfig.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("some static message")
	private String staticMessage;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage;
	}

}
