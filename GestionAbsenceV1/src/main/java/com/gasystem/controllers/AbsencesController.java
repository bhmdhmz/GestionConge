package com.gasystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AbsencesController {
	
	
	@GetMapping("/MesAbsences")
	public String showMesAbsences()
	{
		return "views/Absences";
	}

}
