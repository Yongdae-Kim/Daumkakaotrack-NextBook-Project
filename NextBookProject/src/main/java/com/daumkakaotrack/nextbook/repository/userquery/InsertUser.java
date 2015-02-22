package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class InsertUser implements UserQueryStrategy {
	private User user;

	public InsertUser(User user) {
		this.user = user;
	}

	@Override
	public Object query(UserMapper mapper) {
		mapper.insertUser(user);
		mapper.insertUserRole(user.getUsername());
		return null;
	}
}
