package com.util;

import com.bean.Credentials;

public class Authentication {
	public boolean authenticate(Credentials user) {
		return true;
	}

	public String authorize(String userId) {
		return "";
	}

	public boolean changeLoginStatus(Credentials user, int loginStatus) {
		return true;
	}
}
