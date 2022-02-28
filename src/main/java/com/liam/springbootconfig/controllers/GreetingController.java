package com.liam.springbootconfig.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	// String
	@Value("${my.greeting: default value here}")
	private String greetingMessage;
	
	// List
	@Value("${my.list.values}")
	private List<String> listValues;
	
	// Object(key:value) - hash(#) treats everything inside curly braces after it as a Spring expression language
	@Value("#{${dbValues}}")
	private Map<String, String> dbValues;
	

	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage + listValues + dbValues;
		// Hey Suckas![One, Two, Three]{connectionString=http://__, userName=Karl, password=pass}
	}

}
