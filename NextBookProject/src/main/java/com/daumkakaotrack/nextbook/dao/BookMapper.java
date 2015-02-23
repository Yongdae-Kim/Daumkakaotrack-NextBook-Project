package com.daumkakaotrack.nextbook.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.daumkakaotrack.nextbook.model.Book;

public interface BookMapper {

	@Select("SELECT * FROM nextbook.books WHERE isbn13=#{isbn13}")
	Book getBook(String isbn13);

	@Select("SELECT * FROM nextbook.books")
	ArrayList<Book> getAllBooks();

	@Select("SELECT * "
			+ "FROM nextbook.read_books rb LEFT OUTER JOIN nextbook.books b "
			+ "ON rb.isbn13 = b.isbn13 " + "WHERE username=#{username}")
	ArrayList<Book> getReadBooks(String username);

	@Select("SELECT COUNT(*) FROM nextbook.books " + "WHERE isbn13=#{isbn13}")
	int alreadyHasBook(String isbn13);

	@Select("SELECT COUNT(*) FROM nextbook.read_books "
			+ "WHERE username=#{username} AND isbn13=#{isbn13}")
	int alreadyHasReadBook(@Param("username") String username,
			@Param("isbn13") String isbn13);

	@Select("INSERT INTO books(isbn13, title, author, pub_nm, link, cover_l_url, category) "
			+ "VALUES (#{isbn13},#{title},#{author},#{pub_nm},#{link},#{cover_l_url},#{category})")
	void insertBook(Book book);

	@Select("INSERT INTO nextbook.read_books(username, isbn13)"
			+ "VALUES (#{username}, #{isbn13})")
	void insertReadBook(@Param("username") String username,
			@Param("isbn13") String isbn13);

	@Select("DELETE FROM nextbook.read_books WHERE isbn13=#{isbn13}")
	void deleteReadBook(String isbn13);

	@Select("DELETE FROM nextbook.read_books WHERE username=#{username}")
	void deleteAllUserBooks(String username);

	@Select("DELETE FROM nextbook.books WHERE isbn13=#{isbn13}")
	void deleteBook(String isbn13);
}
