package com.daumkakaotrack.nextbook.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.model.Book;

@Repository
public interface BookDAO {
	public List<Book> getAllBooks();

	public List<Book> getReadBooks(String username);

}
