package com.gmail.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gmail.model.User;

public class UserJDBC {
	private static UserJDBC instance;
	private String getUserQuery = "SELECT * FROM users WHERE emailId = ?;";
	private String addUserQuery = "INSERT INTO users(firstName, lastName, dateOfBirth, gender, emailId, password) VALUES(?,?,?,?,?,?);";

	private UserJDBC() {

	}

	public static UserJDBC getInstance() {
		if (instance == null)
			instance = new UserJDBC();
		return instance;
	}

	public boolean isUserAvailable(User user, Connection connection) throws SQLException {

		PreparedStatement statement = connection.prepareStatement(getUserQuery);
		statement.setString(1, user.getEmailId());
		ResultSet result = statement.executeQuery();

		if (result.next()) {
			String password = result.getString("password");
			return user.getPassword().equals(password);
		}

		return false;
	}

	public boolean addUser(User user, Connection connection) throws SQLException, ParseException {
		 SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
		    SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

		 
		        // Convert date format
		        Date date = inputFormat.parse(user.getDateOfBirth());
		        String formattedDate = outputFormat.format(date);

		PreparedStatement statement = connection.prepareStatement(addUserQuery);
		statement.setString(1, user.getFirstName());
		statement.setString(2, user.getLastName());
		statement.setString(3, formattedDate);
		statement.setString(4, user.getGender());
		statement.setString(5, user.getEmailId());
		statement.setString(6, user.getPassword());
		return statement.executeUpdate()>0;

	}

	public User getUser(String emailId, Connection connection) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(getUserQuery);
		statement.setString(1, emailId);
		ResultSet result = statement.executeQuery();

		if (result.next()) {

			String firstName = result.getNString("firstName");
			String lastName = result.getNString("lastName");
			String dateOfBirth = result.getNString("dateOfBirth");
			String gender = result.getNString("gender");
			String password = result.getString("password");
			return new User(firstName, lastName, dateOfBirth, gender, emailId, password);

		}
		return null;
	}
}
