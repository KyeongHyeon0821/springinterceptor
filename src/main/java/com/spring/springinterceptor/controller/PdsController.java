package com.spring.springinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pds")
public class PdsController {
	
	@GetMapping("/pdsList")
	public String pdsListGet(Model model) {
		model.addAttribute("data", "pdsList");
		return "pds/pdsList";
	}
	
	@GetMapping("/pdsInput")
	public String pdsInputGet(Model model) {
		model.addAttribute("data", "pdsInput");
		return "pds/pdsInput";
	}
	
	@GetMapping("/pdsUpdate")
	public String pdsUpdateGet(Model model) {
		model.addAttribute("data", "pdsUpdate");
		return "pds/pdsUpdate";
	}
	
	@GetMapping("/pdsDelete")
	public String pdsDeleteGet(Model model) {
		model.addAttribute("data", "pdsDelete");
		return "pds/pdsDelete";
	}
	
	@GetMapping("/pdsContent")
	public String pdsContentGet(Model model) {
		model.addAttribute("data", "pdsContent");
		return "pds/pdsContent";
	}
	
	@GetMapping("/pdsDownload")
	public String pdsDownloadGet(Model model) {
		model.addAttribute("data", "pdsDownload");
		return "pds/pdsDownload";
	}

}
