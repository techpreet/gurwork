package com.gur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gur.beans.Question;
import com.gur.dao.QuestionDAO;

@Controller
public class QuestionController {
	@Autowired
	QuestionDAO dao; 
	
	// methods 
	
	@RequestMapping( method = RequestMethod.GET,   path="/all-question")
	public String getAllQuestions(Model model) {
		model.addAttribute("TITLE", "List Of Questions"); 
		model.addAttribute("QUESTIONS", dao.getAllQuestion()); 
		
		return "show-questions";
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/add-question" )
	public String  addQuestion(Model model) {
		model.addAttribute("question", new Question()); 
		return "question-form"; 
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/save-question")
	public String saveQuestion(@ModelAttribute("question") Question question, Model model) {

		if(dao.saveQuestion(question)) {
			model.addAttribute("MSG", "Question Added Successfully" + question.getQuestion());
			return "index"; 
		}
		model.addAttribute("MSG", "Error Adding Quesion: " + question.getQuestion());
		return "error";
	}
}
