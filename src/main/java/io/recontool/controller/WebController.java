package io.recontool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.recontool.service.IssueService;

@Controller
public class WebController {

	@Autowired
	private IssueService issueService;
	
	@RequestMapping("/")
	String home() {
		return "home";
	}
	
	@RequestMapping("/sample")
	String sample(Model model) {
		model.addAttribute("issue", issueService.getIssueById(1));
		return "sample";
	}
}
