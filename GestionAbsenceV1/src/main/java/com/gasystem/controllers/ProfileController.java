package com.gasystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gasystem.services.UserService;

@Controller
public class ProfileController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	public String profilePage()
	{
		return "views/profile"; 
	}

}
