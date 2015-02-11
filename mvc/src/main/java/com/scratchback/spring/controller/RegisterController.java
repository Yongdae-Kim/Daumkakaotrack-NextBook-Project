package com.scratchback.spring.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	private static final Logger logger = LoggerFactory
			.getLogger(RegisterController.class);

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		return "register";
	}

	// @RequestMapping(value = "register", method = RequestMethod.GET)
	// public String register(Locale locale, @ModelAttribute("user") User user,
	// Model model, HttpSession session) {
	//
	// if (!user.getPassword().equals(user.getConfirmPassword())) {
	// model.addAttribute("msg", "password not matched");
	// model.addAttribute("user", user);
	// return "index";
	// }
	//
	// UserDAO.save(user);
	//
	// return "redirect:registerFinished.do";
	// }

	@RequestMapping(value = "/registerFinished.do")
	public String registerFinished(Model model) {
		return "registerFinished";
	}

}
