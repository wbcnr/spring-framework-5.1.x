package com.example;

public class UserBean {
	private String id;
	private String userName;

	public UserBean(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"id='" + id + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
