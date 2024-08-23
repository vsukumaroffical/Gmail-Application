package com.gmail.controller;

import java.sql.SQLException;
import java.text.ParseException;

import com.gmail.model.User;
import com.gmail.service.UserService;
import com.gmail.view.SignInView;
import com.gmail.view.SignUpView;

public class UserController {
	
    private static UserController instance;
    private UserController() {
      
    }
    
    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }
	public boolean signUp() {
		String firstName = SignUpView.getInstance().FirstName();
		String lastName = SignUpView.getInstance().getLastName();
		String dateOfBirth = SignUpView.getInstance().getDateOfBirth();
		String gender = SignUpView.getInstance().getGender();
		
		String emailId =getNewValidEmailId();
		String password  = getNewValidPassword();
		User newUser = new User(firstName,lastName,dateOfBirth,gender,emailId,password);
		try {
			return UserService.getInstance().addNewUser(newUser);
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
		return false;
	}
	private String getNewValidEmailId(){
		 return SignUpView.getInstance().getEmailId();
	}
	
	private String getNewValidPassword(){
		 return SignUpView.getInstance().getPassword();
	}
	public boolean signIn() {
		String emailId = SignInView.getInstance().getEmailId();
		String password = SignInView.getInstance().getPassword();
		
		User user = new User(emailId,password);
		
		try {
			return UserService.getInstance().isExistsUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
