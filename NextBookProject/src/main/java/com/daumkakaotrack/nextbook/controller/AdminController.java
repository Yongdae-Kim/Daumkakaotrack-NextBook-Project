package com.daumkakaotrack.nextbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.service.AuthenticationService;

@Controller
public class AdminController {

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView admin() {

		ModelAndView model = new ModelAndView();
		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/deny", method = RequestMethod.GET)
	public ModelAndView deny() {

		ModelAndView model = new ModelAndView();
		model.addObject("username", new AuthenticationService().getSessionId());
		model.setViewName("deny");
		return model;
	}

}
