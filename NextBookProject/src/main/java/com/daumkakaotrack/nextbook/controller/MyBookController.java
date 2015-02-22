package com.daumkakaotrack.nextbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.service.AuthenticationService;

@Controller
public class MyBookController {
	@Autowired
	private BookDAO bookDAO;

	@RequestMapping(value = "/mybook", method = RequestMethod.GET)
	public ModelAndView myBook() {

		ModelAndView model = new ModelAndView();

		model.addObject("books", bookDAO
				.getReadBooks(new AuthenticationService().getSessionId()));

		model.setViewName("mybook");

		return model;
	}
}
