package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.dao.BookDAO;
import com.daumkakaotrack.nextbook.model.Book;
import com.daumkakaotrack.nextbook.repository.bookquery.DeleteBook;
import com.daumkakaotrack.nextbook.repository.bookquery.FetchAllBooks;
import com.daumkakaotrack.nextbook.repository.bookquery.FetchReadBooks;

@Repository
public class BookDAOImpl implements BookDAO {

	private BookQueryRunner queryRunnuer = new BookQueryRunner();

	@Override
	public List<Book> getAllBooks() {
		BookQueryStrategy strategy = new FetchAllBooks();
		return (List<Book>) queryRunnuer.executeListReturnQuery(strategy);
	}

	@Override
	public List<Book> getReadBooks(String username) {
		BookQueryStrategy strategy = new FetchReadBooks(username);
		return (List<Book>) queryRunnuer.executeListReturnQuery(strategy);
	}

	@Override
	public void deleteBook(String isbn) {
		BookQueryStrategy strategy = new DeleteBook(isbn);
		queryRunnuer.executeNoReturnQuery(strategy);
	}
}
