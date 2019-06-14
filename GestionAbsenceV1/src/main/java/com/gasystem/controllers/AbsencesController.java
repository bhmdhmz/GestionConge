package com.gasystem.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gasystem.entities.User;
import com.gasystem.services.DCongeService;
import com.gasystem.services.UserService;

@Controller
public class AbsencesController {
	
	
	@Autowired
	private UserService userService;
	@Autowired
	private DCongeService dcongeService;
	
	@GetMapping("/mescngs")
	public String showMesAbsences(ModelMap model, Principal principal, @RequestParam(defaultValue = "0") int page)
	{
		String username = principal.getName();
		User user= userService.findUser(username);
		model.addAttribute("lastdemandescng",dcongeService.findTop3ByUser(user));
		model.addAttribute("alldemandescng",dcongeService.findCongesByUser(user));
		
		return "views/mesabsences";
		
	}
	
	@GetMapping("/ajoutcng")
	public String showAjoutercngForm()
	{
		return "views/ajoutconge";
	}
	
	@GetMapping("/ajoutmld")
	public String showAjoutermldForm()
	{
		return "views/ajoutmaladie";
	}
	
	
	

}
