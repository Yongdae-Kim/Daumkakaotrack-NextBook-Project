package com.daumkakaotrack.nextbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.service.AuthenticationService;

@Controller
public class AdminController {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private BookDAO bookDAO;

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView admin() {

		ModelAndView model = new ModelAndView();

		model.addObject("users", userDAO.getAllUsers());
		model.addObject("books", bookDAO.getAllBooks());

		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/deleteUserSubmit", method = RequestMethod.POST)
	public ModelAndView deleteUser(@RequestParam("username") String username) {

		ModelAndView model = new ModelAndView();

		userDAO.deleteUser(username);

		model.addObject("users", userDAO.getAllUsers());
		model.addObject("books", bookDAO.getAllBooks());

		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/deleteBookSubmit", method = RequestMethod.POST)
	public ModelAndView deleteBook(@RequestParam("isbn") String isbn) {

		ModelAndView model = new ModelAndView();

		bookDAO.deleteBook(isbn);

		model.addObject("users", userDAO.getAllUsers());
		model.addObject("books", bookDAO.getAllBooks());

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
