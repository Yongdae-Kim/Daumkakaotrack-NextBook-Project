package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.QueryStrategy;

public class DeleteUserStrategy implements QueryStrategy {
	private String username;

	public DeleteUserStrategy(String username) {
		this.username = username;
	}

	@Override
	public Object query(UserMapper mapper) {
		mapper.deleteUserRole(username);
		mapper.deleteUser(username);
		return null;
	}
}
