package com.microservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SampleController {
	
	@Value("${user.greetingMessage: rivu}") // define default value
	private String greetingMessage;
	
	@Value("${listValues}")
	private List<String> listValues;
	
	@Value("#{${dbvalues}}") // evaluate spring expression by using # tag
	private Map<String, String> dbvalues;
	
	@GetMapping("/")
	public String getGreeting() {
		return greetingMessage + "\t" +listValues + "\t"+ dbvalues;
	}

}
