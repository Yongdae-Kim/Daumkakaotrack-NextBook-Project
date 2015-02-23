package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.model.Book;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class InsertBook implements BookQueryStrategy {

	private Book book;

	public InsertBook(Book book) {
		this.book = book;
	}

	@Override
	public Object query(BookMapper mapper) {
		mapper.insertBook(book);
		return null;
	}
}
