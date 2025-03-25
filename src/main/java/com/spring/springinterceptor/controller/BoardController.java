package com.spring.springinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/boardList")
	public String boardListGet(Model model) {
		model.addAttribute("data", "boardList");
		return "board/boardList";
	}
	
	@GetMapping("/boardInput")
	public String boardInputGet(Model model) {
		model.addAttribute("data", "boardInput");
		return "board/boardInput";
	}
	
	@GetMapping("/boardUpdate")
	public String boardUpdateGet(Model model) {
		model.addAttribute("data", "boardUpdate");
		return "board/boardUpdate";
	}
	
	@GetMapping("/boardDelete")
	public String boardDeleteGet(Model model) {
		model.addAttribute("data", "boardDelete");
		return "board/boardDelete";
	}
	
	@GetMapping("/boardContent")
	public String boardContentGet(Model model) {
		model.addAttribute("data", "boardContent");
		return "board/boardContent";
	}
	
	
}
