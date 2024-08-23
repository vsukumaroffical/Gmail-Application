package com.gmail.model;

public class Folder {
	
	private int folerId;
	private String folderName;
	private int UserId;
	
	public Folder(int folerId, String folderName, int userId) {
		super();
		this.folerId = folerId;
		this.folderName = folderName;
		UserId = userId;
	}
	
	public int getFolerId() {
		return folerId;
	}
	public void setFolerId(int folerId) {
		this.folerId = folerId;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	
}
