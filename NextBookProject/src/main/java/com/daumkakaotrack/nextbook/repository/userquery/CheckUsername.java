package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class CheckUsername implements UserQueryStrategy {

	private String username;

	public CheckUsername(String username) {
		this.username = username;
	}

	@Override
	public Object query(UserMapper mapper) {
		return mapper.isExistedUsername(username) != 0;
	}
}
