package com.gasystem.controllers;

import java.security.Principal;

import com.gasystem.entities.User;
import com.gasystem.services.ServiceService;
import com.gasystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	
	@Autowired 
	private UserService userService;
	 
	
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) 
	{
		String username = principal.getName();
		User user= userService.findUser(username);
		model.addAttribute("userconnecte",user);
		return "views/profile"; 
	}

}
