package com.daumkakaotrack.nextbook.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.repository.UserDAOImpl;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		return "register";
	}

	@RequestMapping(value = "/registerSubmit", method = RequestMethod.POST)
	public ModelAndView registerSubmit(@ModelAttribute @Valid User user,
			BindingResult bindingResult) {

		ModelAndView model = new ModelAndView();

		String error = "";
		String viewName = "register";

		if (!bindingResult.hasErrors()) {

			if (!user.isMatchedPassword()) {
				error = "password does not match the confirm password";
			} else {

				if (new UserDAOImpl().insertUser(user) == true)
					viewName = "login";
				else
					error = "email already in use";
			}
		} else {
			error = "username type is email, password length must be between 5 to 50 characters";
		}

		model.addObject("username", user.getUsername());
		model.addObject("password", user.getPassword());
		model.addObject("error", error);
		model.setViewName(viewName);

		return model;
	}
}
