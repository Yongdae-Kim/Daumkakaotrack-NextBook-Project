package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class CheckBook implements BookQueryStrategy {

	private String isbn;

	public CheckBook(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public Object query(BookMapper mapper) {
		return mapper.alreadyHasBook(isbn) != 0;
	}
}
