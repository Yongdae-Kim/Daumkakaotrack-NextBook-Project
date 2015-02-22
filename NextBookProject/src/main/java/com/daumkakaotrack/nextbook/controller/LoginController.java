package com.daumkakaotrack.nextbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.service.AuthenticationService;

@Controller
public class LoginController {

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title",
				"Spring Security Login Form - Database Authentication");
		model.addObject("message", "This page is for ROLE_ADMIN only!");

		model.setViewName("admin");

		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error) {

		ModelAndView model = new ModelAndView();

		if (error != null) {
			model.addObject("error", "invalid username and password!");
		}

		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/deny", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();
		model.addObject("username", new AuthenticationService().getSessionId());
		model.setViewName("deny");
		return model;
	}
}
