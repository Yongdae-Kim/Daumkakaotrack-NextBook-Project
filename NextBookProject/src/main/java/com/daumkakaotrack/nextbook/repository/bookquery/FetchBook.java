package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class FetchBook implements BookQueryStrategy {

	private String isbn;

	public FetchBook(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public Object query(BookMapper mapper) {
		return mapper.getBook(isbn);
	}
}
