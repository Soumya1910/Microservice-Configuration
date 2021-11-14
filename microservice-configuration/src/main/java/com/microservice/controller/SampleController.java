package com.microservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SampleController {
	
	@Value("${user.greetingMessage: rivu}") // define default value
	private String greetingMessage;
	
	@GetMapping("/")
	public String getGreeting() {
		return greetingMessage;
	}

}
