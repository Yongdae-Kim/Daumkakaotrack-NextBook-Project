package com.daumkakaotrack.nextbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecommendBookController {

	@RequestMapping(value="/recommend", method=RequestMethod.GET)
	public ModelAndView recommendBook(){
		System.out.println("addBook Controller working");
		ModelAndView modelAndView = new ModelAndView("recommend");
		modelAndView.addObject("kkk", "hhh");
		//UserBooksDAO userBook = new UserBookDAOImpl();
		/*boolean addResult = userBook.addBook(isbn);
		model.addAttribute("addResult", addResult);*/
		return modelAndView;
	}
}
