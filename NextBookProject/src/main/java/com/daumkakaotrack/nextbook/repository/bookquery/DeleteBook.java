package com.daumkakaotrack.nextbook.repository.bookquery;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.repository.BookQueryStrategy;

public class DeleteBook implements BookQueryStrategy {
	private String isbn;

	public DeleteBook(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public Object query(BookMapper mapper) {
		mapper.deleteReadBook(isbn);
		mapper.deleteBook(isbn);
		return null;
	}
}
