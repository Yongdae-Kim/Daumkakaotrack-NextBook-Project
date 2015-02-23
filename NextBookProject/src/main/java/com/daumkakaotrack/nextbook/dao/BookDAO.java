package com.daumkakaotrack.nextbook.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.model.Book;

@Repository
public interface BookDAO {
	public Book getBook(String isbn);

	public List<Book> getAllBooks();

	public List<Book> getReadBooks(String username);

	public boolean alreadyHasBook(String isbn);

	public boolean alreadyHasReadBook(String username, String isbn);

	public void insertBook(Book book);

	public void insertReadBook(String username, String isbn);

	public void deleteBook(String isbn);

	public void deleteAllUserBooks(String username);

}
