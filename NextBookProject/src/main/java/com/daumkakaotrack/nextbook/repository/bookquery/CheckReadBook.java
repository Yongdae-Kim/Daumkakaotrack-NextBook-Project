package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class CheckReadBook implements BookQueryStrategy {
	private String username;
	private String isbn;

	public CheckReadBook(String username, String isbn) {
		this.username = username;
		this.isbn = isbn;
	}

	@Override
	public Object query(BookMapper mapper) {
		return mapper.alreadyHasReadBook(username, isbn) != 0;
	}
}
