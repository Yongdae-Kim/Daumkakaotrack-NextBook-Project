package com.daumkakaotrack.nextbook.repository;

import com.daumkakaotrack.nextbook.dao.UserMapper;

public interface UserQueryStrategy {
	Object query(UserMapper mapper);
}