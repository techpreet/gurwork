package com.gur.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gur.beans.Students;
import com.gur.dao.StudentDAO;

/**
*
* @author Gurpreet
*
*/

@Controller
public class StudentController {
	@Autowired
	StudentDAO dao; 
	
	// methods 
	
	@RequestMapping( method = RequestMethod.GET,   path="/all-student")
	public String getAllQuestions(Model model) {
		model.addAttribute("TITLE", "List Of Students"); 
		model.addAttribute("Students", dao.getAllStudents()); 
		
		return "show-students";
	}
	@RequestMapping( method = RequestMethod.GET,   path="/all-student2")
	public String getStudents(Model model) {
		model.addAttribute("TITLE", "List Of Students"); 
		model.addAttribute("Students", dao.getStudents()); 
		
		return "show-students2";
	}
	
	@RequestMapping( method = RequestMethod.GET,   path="/home")
	public String getHome() {
		return "home";
	}
}

