package com.bean;

public class Credentials {
	private String userId;
	private String password;
	private String userType;
	private int loginStatus;

	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credentials(String userId, String password, String userType,
			int loginStatus) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "CredentialsBean [userId=" + userId + ", password=" + password
				+ ", userType=" + userType + ", loginStatus=" + loginStatus
				+ "]";
	}

}
