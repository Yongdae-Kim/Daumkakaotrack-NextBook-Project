package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.QueryStrategy;

public class FindUsernameStrategy implements QueryStrategy {

	private String username;

	public FindUsernameStrategy(String username) {
		this.username = username;
	}

	@Override
	public Object query(UserMapper mapper) {
		return mapper.isExistedUsername(username) != 0;
	}
}
