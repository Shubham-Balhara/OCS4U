package com.dao;

import java.util.List;

import com.bean.Credentials;

public interface CredentialsDao {
	public String addCredentials(Credentials c);
	public List<Credentials> getAllCredentials();
	public Credentials getCredentialsById(String id,String type);
	public String deleteCredentials(Credentials c);
	public String updateCredentials(Credentials c);
}
