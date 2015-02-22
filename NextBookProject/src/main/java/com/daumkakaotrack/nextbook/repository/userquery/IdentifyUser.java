package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class IdentifyUser implements UserQueryStrategy {

	private String username;
	private String password;

	public IdentifyUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Object query(UserMapper mapper) {
		return mapper.IsIdentifiedUser(username, password) != 0;
	}
}
