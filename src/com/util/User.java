package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Credentials;
import com.bean.Profile;
import com.dao.CredentialsDao;
import com.dao.ProfileDao;
@Service

public class User {
	@Autowired
	CredentialsDao cdao ;
	@Autowired
	ProfileDao pdao ;
	
	public String login(Credentials credentials) {
		Credentials  c = cdao.getCredentialsById(credentials.getUserId()) ;
	    // if both id & type matches... else return 
		if(c!=null && (c.getUserType().equals(credentials.getUserType()) ) )
		{
			if(c.getPassword().equals(credentials.getPassword()) )
			{
				return c.getUserType() ;
			}
			else
			{
				return "invalid" ;
			}
		}
		return "invalid";
	}

	public boolean logout(String userId) {
		Credentials credentials = cdao.getCredentialsById(userId) ;
		if(credentials.getLoginStatus()==1){
			credentials.setLoginStatus(0);
			return true;
		}
		return false;
	}

	public String changePassword(Credentials credentials, String newPassword) {
		Credentials  c = cdao.getCredentialsById(credentials.getUserId()) ;
		if(c.getPassword().equals(credentials.getPassword()) )
		{
			credentials.setPassword(newPassword);
		 return cdao.updateCredentials(credentials) ;  
		}
		return "invalid";
	}

	public String register(Profile profile) {
		return pdao.addProfile(profile) ;
	}
	
}
