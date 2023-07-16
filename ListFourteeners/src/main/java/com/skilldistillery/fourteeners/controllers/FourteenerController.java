package com.skilldistillery.fourteeners.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.fourteeners.data.FourteenerDAO;
import com.skilldistillery.fourteeners.entities.Fourteener;

@Controller
public class FourteenerController {
	
	@Autowired
	private FourteenerDAO fourteenerDAO;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("fourteeners", fourteenerDAO.findAll());
		return "home";
	}
	
	@RequestMapping(path= {"findById.do"})
	public String findById (Model model, @RequestParam Integer findById) {
		Fourteener singleFourt = fourteenerDAO.findById(findById);
		model.addAttribute("singleFourt",singleFourt);
		return "result";
	}
	
//	@RequestMapping(path= {"findByKeyword.do"})
//	public String findByKeyword(Model model, @RequestParam("name") String name) {
//		List<Fourteener> someFourts = fourteenerDAO.findByKeyword(name);
//		model.addAttribute("someFourts", someFourts);
//		return "result";
//	}
	
	@RequestMapping(path= {"create.do"})
	public String create (Model model, Fourteener fourteener) {
		Fourteener newF = fourteenerDAO.create(fourteener);
		model.addAttribute("newF",newF);
		return "createSuccess";
	}
	@RequestMapping(path= {"createForm.do"})
	public String createForm() {
		return "create";
	}
	
	@RequestMapping(path= {"update.do"})
	public String update(Model model, Fourteener fourteener, @RequestParam int id) {
		Fourteener updated = fourteenerDAO.update(id,fourteener);
		model.addAttribute("updated",updated);
		return "updateSuccess";
	}
	
	@RequestMapping(path={"delete.do"})
	public String update(@RequestParam int id) {
		boolean deleted = fourteenerDAO.deleteById(id);
		if(deleted) {
			return "deleteSuccess";
		}
			else {
				return "error";
			}
		
	}
	

}
