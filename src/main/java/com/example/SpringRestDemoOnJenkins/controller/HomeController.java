package com.example.SpringRestDemoOnJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/login")
	public String welcomeLogin()
	{
		return "Hey All!!Good day to you!! walmartians";
	}
}
