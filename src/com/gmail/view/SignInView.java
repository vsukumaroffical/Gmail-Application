package com.gmail.view;

import com.gmail.util.ScannerUtil;

public class SignInView {
	private static SignInView instance;

	private SignInView() {

	}

	public static SignInView getInstance() {
		if (instance == null) {
			instance = new SignInView();
		}
		return instance;
	}

	public String getEmailId() {
		System.out.println("Enter the Email Id");
		return ScannerUtil.getInstance().getStringValue();
	}

	public String getPassword() {
		System.out.println("Enter the password");
		return ScannerUtil.getInstance().getStringValue();
	}

}
