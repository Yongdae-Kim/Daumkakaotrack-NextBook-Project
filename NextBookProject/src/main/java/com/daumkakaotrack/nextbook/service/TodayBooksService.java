package com.daumkakaotrack.nextbook.service;

import java.util.ArrayList;
import java.util.List;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.model.Book;
import com.daumkakaotrack.nextbook.repository.BookDAOImpl;

public class TodayBooksService {

	private BookDAO bookDAO = new BookDAOImpl();

	private List<Book> todayBooks;

	public TodayBooksService() {
		todayBooks = new ArrayList<Book>();

		int range = bookDAO.getAllBooks().size();

		todayBooks.add(bookDAO.getAllBooks().get(
				new RandomNumGenerator(range).createNum()));
		todayBooks.add(bookDAO.getAllBooks().get(
				new RandomNumGenerator(range).createNum()));
		todayBooks.add(bookDAO.getAllBooks().get(
				new RandomNumGenerator(range).createNum()));
		todayBooks.add(bookDAO.getAllBooks().get(
				new RandomNumGenerator(range).createNum()));
	}

	public List<Book> getTodayBooks() {
		return todayBooks;
	}

}
