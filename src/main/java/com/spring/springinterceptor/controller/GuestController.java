package com.spring.springinterceptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.springinterceptor.service.GuestService;

@Controller
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	GuestService guestService;
	
	@GetMapping("/guestList")
	public String guestListGet(Model model) {
		model.addAttribute("data", "guestList");
		return "guest/guestList";
	}
	
	@GetMapping("/guestInput")
	public String guestInputGet(Model model) {
		model.addAttribute("data", "guestInput");
		return "guest/guestInput";
	}
	
	@GetMapping("/guestUpdate")
	public String guestUpdateGet(Model model) {
		model.addAttribute("data", "guestUpdate");
		return "guest/guestUpdate";
	}
	
	@GetMapping("/guestDelete")
	public String guestDeleteGet(Model model) {
		model.addAttribute("data", "guestDelete");
		return "guest/guestDelete";
	}
	
	
	
	
}
