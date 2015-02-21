package com.daumkakaotrack.nextbook.repository;

import org.apache.ibatis.session.SqlSession;

import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.db.SessionManager;

@SuppressWarnings("rawtypes")
public class QueryRunner {

	private Class mapperClass;

	public QueryRunner(Class mapperClass) {
		this.mapperClass = mapperClass;
	}

	@SuppressWarnings("unchecked")
	public void executeNoReturnQuery(QueryStrategy strategy) {
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
	public boolean executeBooleanReturnQuery(QueryStrategy strategy) {
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
}
