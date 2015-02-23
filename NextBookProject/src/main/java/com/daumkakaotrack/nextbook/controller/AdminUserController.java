package com.daumkakaotrack.nextbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.dao.UserDAO;

@Controller
public class AdminUserController {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private BookDAO bookDAO;

	@RequestMapping(value = "/deleteUserSubmit", method = RequestMethod.POST)
	public ModelAndView deleteUserSubmit(
			@RequestParam("username") String username) {

		ModelAndView model = new ModelAndView();

		if (!userDAO.isExistedUsername(username)) {
			model.addObject("userMsg", "없는유저입니다.");
		} else {
			bookDAO.deleteAllUserBooks(username);
			userDAO.deleteUser(username);
		}
		model.setViewName("admin");
		return model;
	}
}
