package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class FetchAllBooks implements BookQueryStrategy {

	@Override
	public Object query(BookMapper mapper) {
		return mapper.getAllBooks();
	}
}
