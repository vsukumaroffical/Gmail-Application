package com.gmail.model;

import java.util.Date;

public class Mail {
	private int mailId;
	private int senderId;
	private int receiverId;
	private String subject;
	private String message;
	private Date date;
	private int replyMailId;

	public Mail(int mailId, int senderId, int receiverId, String subject, String message, Date date, int replyMailId) {

		this.mailId = mailId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.subject = subject;
		this.message = message;
		this.date = date;
		this.replyMailId = replyMailId;
	}

	public int getMailId() {
		return mailId;
	}

	public void setMailId(int mailId) {
		this.mailId = mailId;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getReplyMailId() {
		return replyMailId;
	}

	public void setReplyMailId(int replyMailId) {
		this.replyMailId = replyMailId;
	}

}
