package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daumkakaotrack.nextbook.dao.BookMapper;
import com.daumkakaotrack.nextbook.db.SessionManager;
import com.daumkakaotrack.nextbook.model.Book;

@SuppressWarnings("rawtypes")
public class BookQueryRunner {

	private final Class mapperClass = BookMapper.class;

	@SuppressWarnings("unchecked")
	public void executeNoReturnQuery(BookQueryStrategy strategy) {
		SqlSession session = new SessionManager().createSession(mapperClass);
		BookMapper mapper = session.getMapper(mapperClass);
		try {
			strategy.query(mapper);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Book> executeListReturnQuery(BookQueryStrategy strategy) {
		SqlSession session = new SessionManager().createSession(mapperClass);
		BookMapper mapper = session.getMapper(mapperClass);
		try {
			return (List<Book>) strategy.query(mapper);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}
}
