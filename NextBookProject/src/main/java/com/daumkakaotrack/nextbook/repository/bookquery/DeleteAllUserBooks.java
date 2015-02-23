package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class DeleteAllUserBooks implements BookQueryStrategy {
	private String username;

	public DeleteAllUserBooks(String username) {
		this.username = username;
	}

	@Override
	public Object query(BookMapper mapper) {
		mapper.deleteAllUserBooks(username);
		return null;
	}
}
