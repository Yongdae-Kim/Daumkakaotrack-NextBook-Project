package com.daumkakaotrack.nextbook.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.daumkakaotrack.nextbook.model.User;

public interface UserMapper {

	@Select("SELECT * FROM nextbook.users")
	ArrayList<User> getUsers();

	@Select("INSERT INTO nextbook.users (username,password,enabled)"
			+ "VALUES (#{username},#{password},TRUE)")
	void insertUser(User user);

	@Select("INSERT INTO nextbook.user_roles(username, ROLE)"
			+ "VALUES (#{username},'ROLE_USER')")
	void insertUserRole(String username);

	@Select("DELETE FROM nextbook.user_roles WHERE username=#{username}")
	void deleteUserRole(String username);

	@Select("DELETE FROM nextbook.users WHERE username=#{username}")
	void deleteUser(String username);

	@Select("UPDATE nextbook.users SET password=#{password} WHERE username=#{username}")
	void updateUserPassword(@Param("username") String username,
			@Param("password") String password);

	@Select("SELECT COUNT(*) FROM nextbook.users WHERE username=#{username}")
	int isExistedUsername(String username);

	@Select("SELECT COUNT(*) FROM nextbook.users WHERE username=#{username} AND password=#{password}")
	int IsIdentifiedUser(@Param("username") String username,
			@Param("password") String password);
}
