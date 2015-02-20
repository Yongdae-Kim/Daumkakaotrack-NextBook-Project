package com.daumkakaotrack.nextbook.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.model.User;

@Repository
public interface UserDAO {
	public List<User> getUsers();

	public void insertUser(User user);

	public void updateUserPassword(String username, String password);

	public void deleteUser(String username);

	public boolean isExistedUser(String username);

	public boolean IsIdentifiedUser(String username, String password);
}
