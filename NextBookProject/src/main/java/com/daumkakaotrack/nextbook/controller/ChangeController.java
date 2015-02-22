package com.daumkakaotrack.nextbook.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.service.AuthenticationService;

@Controller
public class ChangeController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	public ModelAndView reset() {

		ModelAndView model = new ModelAndView();
		model.setViewName("change");
		return model;
	}

	@RequestMapping(value = "/changeSubmit", method = RequestMethod.POST)
	public ModelAndView changeSubmit(
			@RequestParam("oldPassword") String oldPassword,
			@ModelAttribute @Valid User user, BindingResult bindingResult) {

		ModelAndView model = new ModelAndView();

		String username = new AuthenticationService().getSessionId();
		String msg = "";
		String viewName = "change";

		if (!bindingResult.hasErrors()) {

			if (!user.isMatchedPassword()) {
				msg = "password doesn't match the confirm password!";
			} else {
				if (userDAO.isIdentifiedUser(username, oldPassword)) {
					if (!oldPassword.equals(user.getPassword())) {
						userDAO.updateUserPassword(username, user.getPassword());
						viewName = "index";
					} else {
						msg = "new Password should not be same as old password";
					}
				} else {
					msg = "old password is invalid!";
				}
			}
		} else {
			msg = "password length must be between 5 to 50 characters!";
		}

		model.addObject("msg", msg);
		model.setViewName(viewName);

		return model;
	}
}
