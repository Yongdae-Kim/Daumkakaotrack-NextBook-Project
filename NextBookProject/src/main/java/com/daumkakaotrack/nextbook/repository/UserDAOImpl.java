package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.db.SessionManager;
import com.daumkakaotrack.nextbook.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser(User user) {

		boolean result = false;

		SqlSession session = new SessionManager()
				.createSession(UserMapper.class);
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			if (mapper.isExistedUsername(user.getUsername()) == 0) {
				mapper.insertUser(user);
				mapper.insertUserRole(user.getUsername());
				result = true;
			}
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public void updateUser(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String username) {
		SqlSession session = new SessionManager()
				.createSession(UserMapper.class);
		UserMapper mapper = session.getMapper(UserMapper.class);
		try {
			mapper.deleteUserRole(username);
			mapper.deleteUser(username);
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			session.close();
		}
	}
}
