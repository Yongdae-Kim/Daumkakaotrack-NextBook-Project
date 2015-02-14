package com.scratchback.spring.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.scratchback.spring.user.User;

public interface UserMapper {

	@Select("SELECT * FROM nextbook.users WHERE username = #{username} AND password = #{password}")
	User selectUserQuery(@Param("username") String username,
			@Param("password") String password);
}
