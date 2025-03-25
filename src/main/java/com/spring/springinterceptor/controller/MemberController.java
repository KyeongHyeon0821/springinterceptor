package com.spring.springinterceptor.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping("/memberLogin")
	public String memberLoginGet(Model model) {
		model.addAttribute("data", "memberLogin");
		return "member/memberLogin";
	}
	
	@PostMapping("/memberLogin")
	public String memberLoginPost(Model model, HttpSession session, String mid, int level) {
		if(level == 0) session.setAttribute("sLevel", 0);
		else if(level == 1) session.setAttribute("sLevel", 1);
		else if(level == 2) session.setAttribute("sLevel", 2);
		else if(level == 3) session.setAttribute("sLevel", 3);
		
		session.setAttribute("sMid", mid);
		
		model.addAttribute("data", "memberLogin");
		
		return "redirect:/message/memberLoginOk";
	}
	
	@GetMapping("/memberJoin")
	public String memberJoinGet(Model model) {
		model.addAttribute("data", "memberJoin");
		return "member/memberJoin";
	}
	
	@GetMapping("/memberIdCheck")
	public String memberIdCheckGet(Model model) {
		model.addAttribute("data", "memberIdCheck");
		return "member/memberIdCheck";
	}
	
	@GetMapping("/memberJoinOk")
	public String memberJoinOkGet(Model model) {
		model.addAttribute("data", "memberJoinOk");
		return "member/memberJoinOk";
	}
	
	@GetMapping("/memberMain")
	public String memberMainGet(Model model) {
		model.addAttribute("data", "memberMain");
		return "member/memberMain";
	}
	
	@GetMapping("/memberUpdate")
	public String memberUpdateGet(Model model) {
		model.addAttribute("data", "memberUpdate");
		return "member/memberUpdate";
	}
	
	@GetMapping("/memberDelete")
	public String memberDeleteGet(Model model) {
		model.addAttribute("data", "memberDelete");
		return "member/memberDelete";
	}
	
	@GetMapping("/memberList")
	public String memberListGet(Model model) {
		model.addAttribute("data", "memberList");
		return "member/memberList";
	}
	
	@GetMapping("/memberSearch")
	public String memberSearchGet(Model model) {
		model.addAttribute("data", "memberSearch");
		return "member/memberSearch";
	}
	
	@GetMapping("/memberLogout")
	public String memberSearchGet(HttpSession session) {
		session.invalidate();
		return "redirect:/message/memberLogoutOk";
	}
	
	
	
}
