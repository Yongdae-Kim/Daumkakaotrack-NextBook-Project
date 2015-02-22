package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class FetchReadBooks implements BookQueryStrategy {
	private String username;

	public FetchReadBooks(String username) {
		this.username = username;
	}

	@Override
	public Object query(BookMapper mapper) {
		return mapper.getReadBooks(username);
	}
}
