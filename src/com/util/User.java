package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Credentials;
import com.bean.Patient;
import com.bean.Profile;
import com.dao.CredentialsDao;
import com.dao.PatientDao;
import com.dao.ProfileDao;
@Service

public class User {
	@Autowired
	CredentialsDao cdao ;
	@Autowired
	ProfileDao pdao ;
	@Autowired
	PatientDao patientdao;
	static int index = 0;
	
	public String login(Credentials credentials) {
		Credentials  c = cdao.getCredentialsById(credentials.getUserId()) ;
		if(c!=null && (c.getUserType().equals(credentials.getUserType()) ) )
		{
			if(c.getPassword().equals(credentials.getPassword()) && c.getLoginStatus() == 0 )
			{
				c.setLoginStatus(1);
				cdao.updateCredentials(c);
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
		if(credentials.getLoginStatus() == 1){
			credentials.setLoginStatus(0);
			cdao.updateCredentials(credentials);
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
		index++;
		String id = "P"+profile.getFirstName().charAt(0)+profile.getLastName().charAt(0);
		if(index<10){
			id += "00"+index;
		}else if(index<100){
			id+="0"+index;
		}else{
			id+=index;
		}
		profile.setUserId(id);
		if(pdao.addProfile(profile).equals("success")){
			Credentials credentials = new Credentials(id, profile.getPassword(), "Patient", 0);
			cdao.addCredentials(credentials);
			Patient patient = new Patient(id, null, null, null, null);
			patient.setPatientId("TM"+id);
			patientdao.addProfile(patient);
			return id;
		}else{
			return "fail";
		}
	}
	
}
