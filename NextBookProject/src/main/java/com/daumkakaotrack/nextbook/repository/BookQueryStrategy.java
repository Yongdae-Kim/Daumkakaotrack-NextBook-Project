package com.daumkakaotrack.nextbook.repository;

import com.daumkakaotrack.nextbook.dao.BookMapper;

public interface BookQueryStrategy {
	Object query(BookMapper mapper);
}