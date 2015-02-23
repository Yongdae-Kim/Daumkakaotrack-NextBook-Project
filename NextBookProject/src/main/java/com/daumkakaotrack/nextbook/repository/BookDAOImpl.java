package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.model.Book;
import com.daumkakaotrack.nextbook.repository.bookquery.CheckBook;
import com.daumkakaotrack.nextbook.repository.bookquery.CheckReadBook;
import com.daumkakaotrack.nextbook.repository.bookquery.DeleteAllUserBooks;
import com.daumkakaotrack.nextbook.repository.bookquery.DeleteBook;
import com.daumkakaotrack.nextbook.repository.bookquery.FetchAllBooks;
import com.daumkakaotrack.nextbook.repository.bookquery.FetchBook;
import com.daumkakaotrack.nextbook.repository.bookquery.FetchReadBooks;
import com.daumkakaotrack.nextbook.repository.bookquery.InsertBook;
import com.daumkakaotrack.nextbook.repository.bookquery.InsertReadBook;

@Repository
public class BookDAOImpl implements BookDAO {

	private BookQueryRunner queryRunnuer = new BookQueryRunner();
	private BookQueryStrategy strategy;

	@Override
	public Book getBook(String isbn) {
		strategy = new FetchBook(isbn);
		return (Book) queryRunnuer.executeBookReturnQuery(strategy);
	}

	@Override
	public List<Book> getAllBooks() {
		strategy = new FetchAllBooks();
		return (List<Book>) queryRunnuer.executeListReturnQuery(strategy);
	}

	@Override
	public List<Book> getReadBooks(String username) {
		strategy = new FetchReadBooks(username);
		return (List<Book>) queryRunnuer.executeListReturnQuery(strategy);
	}

	@Override
	public boolean alreadyHasBook(String isbn) {
		strategy = new CheckBook(isbn);
		return (Boolean) queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public boolean alreadyHasReadBook(String username, String isbn) {
		strategy = new CheckReadBook(username, isbn);
		return (Boolean) queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public void deleteBook(String isbn) {
		strategy = new DeleteBook(isbn);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void insertBook(Book book) {
		strategy = new InsertBook(book);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void insertReadBook(String username, String isbn) {
		strategy = new InsertReadBook(username, isbn);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void deleteAllUserBooks(String username) {
		strategy = new DeleteAllUserBooks(username);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

}
