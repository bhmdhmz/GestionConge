package com.gasystem.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gasystem.entities.DemandeConge;
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
		
		
		
		// pagination
		PageRequest pageable = new PageRequest(page, 10);
		Page<DemandeConge> alldemandes = dcongeService.findCongesByUser(user,pageable);
		int totalPages = alldemandes.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                .boxed()
                .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
		model.addAttribute("alldemandescng",alldemandes);
		
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
	
	
	@GetMapping("/cngcalendar")
	public String showcngclandarForm()
	{
		return "views/calendar";
	}


}
