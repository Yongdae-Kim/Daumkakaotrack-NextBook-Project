package com.daumkakaotrack.nextbook.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.daumkakaotrack.nextbook.dao.UserDAO;
import com.daumkakaotrack.nextbook.model.User;
import com.daumkakaotrack.nextbook.repository.userquery.CheckUsername;
import com.daumkakaotrack.nextbook.repository.userquery.DeleteUser;
import com.daumkakaotrack.nextbook.repository.userquery.IdentifyUser;
import com.daumkakaotrack.nextbook.repository.userquery.InsertUser;
import com.daumkakaotrack.nextbook.repository.userquery.UpdatePassword;

@Repository
public class UserDAOImpl implements UserDAO {

	private UserQueryRunner queryRunnuer = new UserQueryRunner();

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExistedUsername(String username) {
		UserQueryStrategy strategy = new CheckUsername(username);
		return queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public boolean isIdentifiedUser(String username, String password) {
		UserQueryStrategy strategy = new IdentifyUser(username, password);
		return queryRunnuer.executeBooleanReturnQuery(strategy);
	}

	@Override
	public void insertUser(User user) {
		UserQueryStrategy strategy = new InsertUser(user);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void updateUserPassword(String username, String password) {
		UserQueryStrategy strategy = new UpdatePassword(username, password);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

	@Override
	public void deleteUser(String username) {
		UserQueryStrategy strategy = new DeleteUser(username);
		queryRunnuer.executeNoReturnQuery(strategy);
	}

}
