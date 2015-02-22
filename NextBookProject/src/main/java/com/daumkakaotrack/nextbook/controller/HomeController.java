package com.daumkakaotrack.nextbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.service.TodayBooksService;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();

		TodayBooksService service = new TodayBooksService();
		model.addObject("books", service.getTodayBooks());

		model.setViewName("index");

		return model;
	}
}
