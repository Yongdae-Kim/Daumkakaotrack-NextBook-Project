package com.daumkakaotrack.nextbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.model.Book;

@Controller
public class AdminBookController {

	@Autowired
	private BookDAO bookDAO;
	private String bookMsg = "";

	@RequestMapping(value = "/searchBookSubmit", method = RequestMethod.POST)
	public ModelAndView searchBookSubmit(@RequestParam("isbn13") String isbn) {

		ModelAndView model = new ModelAndView();

		if (!bookDAO.alreadyHasBook(isbn))
			model.addObject("bookMsg", "nothing");
		else
			model.addObject("findBook", bookDAO.getBook(isbn));

		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/bookSubmit", method = RequestMethod.POST)
	public ModelAndView bookSubmit(@RequestParam("btnVal") String btnVal,
			@ModelAttribute Book book) {

		ModelAndView model = new ModelAndView();

		switch (btnVal) {
		case "DELETE":
			deleteBook(book);
			break;
		case "ADD":
			insertBook(book);
			break;
		default:
			bookMsg = "asdas";
			break;
		}
		model.addObject("bookMsg", bookMsg);
		model.setViewName("admin");

		return model;
	}

	private void deleteBook(Book book) {
		if (!bookDAO.alreadyHasBook(book.getIsbn13()))
			bookMsg = "그딴건 존재하지않음";
		else
			bookDAO.deleteBook(book.getIsbn13());
	}

	private void insertBook(Book book) {
		if (!bookDAO.alreadyHasBook(book.getIsbn13()))
			bookDAO.insertBook(book);
		else
			bookMsg = "이미존재함ㅅㅂ아";
	}
}
