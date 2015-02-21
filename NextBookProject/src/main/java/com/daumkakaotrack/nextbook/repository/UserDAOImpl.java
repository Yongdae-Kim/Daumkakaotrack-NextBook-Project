package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.dao.UserMapper;
import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.repository.userquery.DeleteUserStrategy;
import com.daumkakaotrack.nextbook.repository.userquery.FindUsernameStrategy;
import com.daumkakaotrack.nextbook.repository.userquery.IdentifyUserStrategy;
import com.daumkakaotrack.nextbook.repository.userquery.InsertUserStrategy;
import com.daumkakaotrack.nextbook.repository.userquery.UpdatePwStrategy;

@Repository
public class UserDAOImpl implements UserDAO {

	QueryRunner queryRunnuer = new QueryRunner(UserMapper.class);

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExistedUsername(String username) {
		QueryStrategy strategy = new FindUsernameStrategy(username);
		return queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public boolean isIdentifiedUser(String username, String password) {
		QueryStrategy strategy = new IdentifyUserStrategy(username, password);
		return queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public void insertUser(User user) {
		QueryStrategy strategy = new InsertUserStrategy(user);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void updateUserPassword(String username, String password) {
		QueryStrategy strategy = new UpdatePwStrategy(username, password);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void deleteUser(String username) {
		QueryStrategy strategy = new DeleteUserStrategy(username);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

}
