package com.daumkakaotrack.nextbook.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.model.User;

@Controller
public class RegisterController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		return "register";
	}

	@RequestMapping(value = "/registerSubmit", method = RequestMethod.POST)
	public ModelAndView registerSubmit(@ModelAttribute @Valid User user,
			BindingResult bindingResult) {

		ModelAndView model = new ModelAndView();

		String msg = "";
		String viewName = "register";

		if (!bindingResult.hasErrors()) {

			if (!user.isMatchedPassword()) {
				msg = "password doesn't match the confirm password";
			} else {
				if (!userDAO.isExistedUser(user.getUsername())) {
					userDAO.insertUser(user);
					viewName = "login";
				} else {
					msg = "email already in use";
				}
			}
		} else {
			msg = "password length must be between 5 to 50 characters";
		}

		model.addObject("username", user.getUsername());
		model.addObject("password", user.getPassword());
		model.addObject("msg", msg);
		model.setViewName(viewName);

		return model;
	}
}
