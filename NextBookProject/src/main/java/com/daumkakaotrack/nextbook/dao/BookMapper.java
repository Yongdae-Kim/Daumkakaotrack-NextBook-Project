package com.daumkakaotrack.nextbook.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.daumkakaotrack.nextbook.model.Book;

public interface BookMapper {
	@Select("SELECT * FROM nextbook.books")
	ArrayList<Book> getAllBooks();

	@Select("SELECT * "
			+ "FROM nextbook.read_books rb LEFT OUTER JOIN nextbook.books b "
			+ "ON rb.isdn = b.isdn " + "WHERE username=#{username}")
	ArrayList<Book> getReadBooks(String username);

	@Select("DELETE FROM nextbook.read_books WHERE isdn=#{isbn}")
	void deleteReadBook(String isbn);

	@Select("DELETE FROM nextbook.books WHERE isdn=#{isbn}")
	void deleteBook(String isbn);
}
