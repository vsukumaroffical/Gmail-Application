package com.gmail.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import com.gmail.jdbc.UserJDBC;
import com.gmail.model.User;
import com.gmail.util.ServiceUtil;

public class UserService extends ServiceUtil {
	private static UserService instance;

	private UserService() {

	}
	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	public boolean isExistsUser(User user) throws SQLException {
		Connection connection = ServiceUtil.getGmailDBConnection();
		return UserJDBC.getInstance().isUserAvailable(user, connection);
	}

	public boolean addNewUser(User user) throws SQLException, ParseException {
		Connection connection = ServiceUtil.getGmailDBConnection();
		return UserJDBC.getInstance().addUser(user, connection);

	}
	
	public User getUser(String emailId) throws SQLException {
		Connection connection = ServiceUtil.getGmailDBConnection();
		return UserJDBC.getInstance().getUser(emailId, connection);
	}
}
