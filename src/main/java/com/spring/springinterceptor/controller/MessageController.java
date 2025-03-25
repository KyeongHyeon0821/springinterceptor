package com.spring.springinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

	@GetMapping("/message/{msgflag}")
	public String boardListGet(Model model, @PathVariable String msgflag) {
		if(msgflag.equals("loginError")) {
			model.addAttribute("message", "로그인 후 사용하세요.");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgflag.equals("memberLoginOk")) {
			model.addAttribute("message", "로그인 되었습니다.");
			model.addAttribute("url", "member/memberMain");
		}
		else if(msgflag.equals("memberLogoutOk")) {
			model.addAttribute("message", "로그아웃 되었습니다.");
			model.addAttribute("url", "member/memberLogin");
		}
		else if(msgflag.equals("levelError")) {
			model.addAttribute("message", "회원등급을 확인하세요.");
			model.addAttribute("url", "member/memberMain");
		}
		
		return "include/message";
	}
	
	
}
