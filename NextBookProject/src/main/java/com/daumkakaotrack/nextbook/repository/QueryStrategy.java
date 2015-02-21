package com.daumkakaotrack.nextbook.repository;

import com.daumkakaotrack.nextbook.dao.UserMapper;

public interface QueryStrategy {
	Object query(UserMapper mapper);
}