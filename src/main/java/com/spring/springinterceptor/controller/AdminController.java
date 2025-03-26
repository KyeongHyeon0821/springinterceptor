package com.spring.springinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/adminLeft")
	public String adminLeftGet(Model model) {
		model.addAttribute("data", "adminLeft");
		return "board/adminLeft";
	}
	
	@GetMapping("/adminMain")
	public String adminMainGet(Model model) {
		model.addAttribute("data", "adminMain");
		return "board/adminMain";
	}
	
	@GetMapping("/adminRight")
	public String adminRightGet(Model model) {
		model.addAttribute("data", "adminRight");
		return "board/adminRight";
	}
}
