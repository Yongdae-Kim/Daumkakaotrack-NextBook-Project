package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.QueryStrategy;

public class IdentifyUserStrategy implements QueryStrategy {

	private String username;
	private String password;

	public IdentifyUserStrategy(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Object query(UserMapper mapper) {
		return mapper.IsIdentifiedUser(username, password) != 0;
	}
}
