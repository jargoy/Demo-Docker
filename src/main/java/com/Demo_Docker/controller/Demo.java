package com.Demo_Docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Hello_World-Demo";
	}
	

}
