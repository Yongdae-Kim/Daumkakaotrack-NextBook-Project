package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.db.SessionManager;
import com.daumkakaotrack.nextbook.model.User;

@SuppressWarnings("rawtypes")
public class UserQueryRunner {

	private final Class mapperClass = UserMapper.class;

	@SuppressWarnings("unchecked")
	public void executeNoReturnQuery(UserQueryStrategy strategy) {
		SqlSession session = new SessionManager().createSession(mapperClass);
		UserMapper mapper = session.getMapper(mapperClass);
		try {
			strategy.query(mapper);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public boolean executeBooleanReturnQuery(UserQueryStrategy strategy) {
		SqlSession session = new SessionManager().createSession(mapperClass);
		UserMapper mapper = session.getMapper(mapperClass);
		try {
			return (Boolean) strategy.query(mapper);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<User> executeListReturnQuery(UserQueryStrategy strategy) {
		SqlSession session = new SessionManager().createSession(mapperClass);
		UserMapper mapper = session.getMapper(mapperClass);
		try {
			return (List<User>) strategy.query(mapper);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}
}
