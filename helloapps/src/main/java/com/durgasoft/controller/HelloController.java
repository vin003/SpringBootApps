package com.durgasoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello" , method=RequestMethod.GET)
	public String sayHello()
	{
		return "<h1  <style='color:red;'>Welcome to Spring Boot Application using STS  </h1> "  ; 
	}

}
