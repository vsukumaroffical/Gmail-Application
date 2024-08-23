package com.gmail.view;

import com.gmail.util.ScannerUtil;

public class SignUpView {
	private static SignUpView instance;

	private SignUpView() {

	}

	public static SignUpView getInstance() {
		if (instance == null) {
			instance = new SignUpView();
		}
		return instance;
	}

	public String getEmailId() {
		System.out.println("Enter the New Email Id");
		return ScannerUtil.getInstance().getStringValue();
	}

	public String getPassword() {
		System.out.println("Enter the New Password Id");
		return ScannerUtil.getInstance().getStringValue();
	}
	public String FirstName() {
		System.out.println("Enter the First Name");
		return ScannerUtil.getInstance().getStringValue();
	}
	public String getLastName() {
		System.out.println("Enter the Last Name");
		return ScannerUtil.getInstance().getStringValue();
	}
	public String getGender() {
		System.out.println("Enter the Gender[Male/Female]");
		return ScannerUtil.getInstance().getStringValue();
	}
	public String getDateOfBirth() {
		System.out.println("Enter the DOB(DD/MM/YYYY)");
		return ScannerUtil.getInstance().getStringValue();
	}
	
}
