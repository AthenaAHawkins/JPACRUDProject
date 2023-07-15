package com.skilldistillery.fourteeners.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.fourteeners.data.FourteenerDAO;

@Controller
public class FourteenerController {
	
	@Autowired
	private FourteenerDAO fourteenerDAO;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("fourteeners", fourteenerDAO.findAll());
		return "home";
	}
	
	
	

}
