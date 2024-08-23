package com.gmail.view;

public class MainMenuView {
	private  static MainMenuView instance;
	private MainMenuView(){
		
	}
	public static  MainMenuView getInstance() {
		if(instance == null)
			instance = new MainMenuView();
		return instance;
	}
	
	public void displayMainMenuOption(){
		System.out.println("1. Sign Up");
		System.out.println("2. Sign In");
		System.out.println("3. Exit");
	}
}
