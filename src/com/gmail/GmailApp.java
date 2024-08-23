package com.gmail;

import com.gmail.controller.MainMenuOptionController;
import com.gmail.model.User;

public class GmailApp {
	
	private User currentUser;
	
	public static void startGmailApp() {
		MainMenuOptionController.getInstance().handleMainMenuOption();
	}
	
	public void setCurrentUser(User currentUser){
		this.currentUser = currentUser;
	}
	
	
}
