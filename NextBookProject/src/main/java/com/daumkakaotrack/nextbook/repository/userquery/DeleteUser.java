package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class DeleteUser implements UserQueryStrategy {
	private String username;

	public DeleteUser(String username) {
		this.username = username;
	}

	@Override
	public Object query(UserMapper mapper) {
		mapper.deleteUserRole(username);
		mapper.deleteUser(username);
		return null;
	}
}
