package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.QueryStrategy;

public class UpdatePwStrategy implements QueryStrategy {

	private String username;
	private String password;

	public UpdatePwStrategy(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Object query(UserMapper mapper) {
		mapper.updateUserPassword(username, password);
		return null;
	}
}
