package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.main.User;

@Controller
public class UserController 
{
	
	@GetMapping("/index")
	public String GetForm(Model model)
	{
		model.addAttribute("User", new User());
		return "index";
	}
}
