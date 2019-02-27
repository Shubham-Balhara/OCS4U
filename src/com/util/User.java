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
	
	public Credentials login(Credentials credentials) {
		Credentials credentials2 = cdao.getCredentialsById(credentials.getUserId());
		if(credentials2.getPassword().equals(credentials.getPassword())){
			credentials2.setLoginStatus(1);
			cdao.updateCredentials(credentials2);
			return credentials2;
		}
		else{
			return null;
		}
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
  //=========== Update Password
	public String changePassword(String userId,String oldPassword, String newPassword) {
		Credentials  c = cdao.getCredentialsById(userId) ;
		if(c.getPassword().equals(oldPassword) )
		{
			c.setPassword(newPassword);
		 return cdao.updateCredentials(c) ;  
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
