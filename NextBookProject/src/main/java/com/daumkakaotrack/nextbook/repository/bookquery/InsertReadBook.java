package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class InsertReadBook implements BookQueryStrategy {

	private String username;
	private String isbn;

	public InsertReadBook(String username, String isbn) {
		this.username = username;
		this.isbn = isbn;
	}

	@Override
	public Object query(BookMapper mapper) {
		mapper.insertReadBook(username, isbn);
		return null;
	}
}
