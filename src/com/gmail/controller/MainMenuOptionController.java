package com.gmail.controller;

import com.gmail.util.ScannerUtil;
import com.gmail.view.MainMenuView;

public class MainMenuOptionController {
	
	private static MainMenuOptionController  instance;
	private MainMenuOptionController() {
		
	}
	public  static MainMenuOptionController getInstance() {
		if(instance == null) 
			instance = new MainMenuOptionController();
		
		return instance;
	}
	
	public void handleMainMenuOption() {
		 boolean exit = false;
	        do {
	            MainMenuView.getInstance().displayMainMenuOption();
	            byte option = ScannerUtil.getInstance().getByteValue();

	            switch (option) {
	                case 1 -> {
	                    if (UserController.getInstance().signUp()) {
	                        System.out.println("Sign-up successful! You can now sign in.");
	                        
	                    } else {
	                        System.out.println("Sign-up failed. Please try again.");
	                    }
	                }
	                case 2 -> {
	                    if (UserController.getInstance().signIn()) {
	                        System.out.println("Sign-in successful! Welcome back.");
	                        
	                        // You can add code here to navigate to the main application dashboard
	                    } else {
	                        System.out.println("Sign-in failed. Please check your credentials and try again.");
	                    }
	                }
	                case 3 -> {
	                    exit = true;
	                    System.out.println("Thank you for using our application. Goodbye!");
	                }
	                default -> {
	                    System.out.println("Invalid option! Please enter a valid number from the menu.");
	                }
	            }
	        } while (!exit);
	}
	public void usergoToGmailApp(String emailId) {
		
	}

}
