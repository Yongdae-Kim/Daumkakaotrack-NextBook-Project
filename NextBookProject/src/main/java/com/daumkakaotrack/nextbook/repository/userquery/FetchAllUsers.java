package com.daumkakaotrack.nextbook.repository.userquery;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.repository.UserQueryStrategy;

public class FetchAllUsers implements UserQueryStrategy {

	@Override
	public Object query(UserMapper mapper) {
		return mapper.getAllUsers();
	}
}
