package com.scratchback.spring.query;

import com.scratchback.spring.mapper.UserMapper;
import com.scratchback.spring.user.User;

public class SelectUserQuery implements QueryStatement {
	private UserMapper mapper;
	private String username;
	private String password;

	public SelectUserQuery(UserMapper mapper, String username, String password) {
		this.mapper = mapper;
		this.username = username;
		this.password = password;
	}

	@Override
	public User query() {
		return mapper.selectUserQuery(username, password);
	}
}
