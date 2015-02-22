package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class UpdatePassword implements UserQueryStrategy {

	private String username;
	private String password;

	public UpdatePassword(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Object query(UserMapper mapper) {
		mapper.updateUserPassword(username, password);
		return null;
	}
}
