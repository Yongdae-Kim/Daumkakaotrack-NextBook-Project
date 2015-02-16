package com.daumkakaotrack.nextbook.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.repository.UserDAOImpl;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		return "register";
	}

	@RequestMapping(value = "/registerSubmit", method = RequestMethod.GET)
	public ModelAndView registerSubmit(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();

		String newUsername = request.getParameter("newUsername");
		String newUserPassword = request.getParameter("newUserPassword");
		String newUserConfirmPassword = request
				.getParameter("newUserConfirmPassword");

		if (!newUserPassword.equals(newUserConfirmPassword)) {
			model.addObject("username", newUsername);
			model.addObject("error",
					"Password does not match the confirm password");
			model.setViewName("register");
			return model;
		}

		User user = new User();
		user.setUsername(newUsername);
		user.setPassword(newUserPassword);

		UserDAOImpl userDAOImpl = new UserDAOImpl();
		userDAOImpl.insertUser(user);

		model.addObject("username", user.getUsername());
		model.addObject("password", user.getPassword());

		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public String reset(Locale locale, Model model) {
		return "reset";
	}
}
