package io.recontool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.recontool.service.IssueService;
import io.recontool.service.RoleService;

@Controller
public class WebController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/")
	String home() {
		return "home";
	}
	
	@RequestMapping("/sample")
	String sample(Model model) {
		model.addAttribute("issue", roleService.getRoleByName("Admin"));
		return "sample";
	}
}
