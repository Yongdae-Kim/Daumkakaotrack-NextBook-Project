package com.daumkakaotrack.nextbook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.model.TodayBook;
import com.daumkakaotrack.nextbook.service.TodayBooksService;

@Controller
public class MyBookController {

	@RequestMapping(value = "/mybook", method = RequestMethod.GET)
	public ModelAndView myBook() {

		ModelAndView model = new ModelAndView();

		TodayBooksService service = new TodayBooksService();

		List<TodayBook> newList = new ArrayList<TodayBook>(
				service.getTodayBooks());
		newList.addAll(service.getTodayBooks());

		model.addObject("randomBooks", newList);

		model.setViewName("mybook");
		return model;
	}
}
