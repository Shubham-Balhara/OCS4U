package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Patient;
import com.dao.DoctorDao;

@Service
public class AdministratorService {
	@Autowired
	DoctorDao ddao;
	static int index = 0;
	
	public String addDoctor(Doctor d){
		index++;
		String id = "DM"+d.getDoctorName().charAt(0);
		if(index<10){
			id += "00"+index;
		}else if(index<100){
			id+="0"+index;
		}else{
			id+=index;
		}
		d.setDoctorId(id);
		if(ddao.addDoctor(d).equals("success")){
			return "success";
		}else{
			return "fail";
		}
	}
	
	public String updateDoctor(Doctor d){
		return ddao.updateDoctor(d);
	}
	
	public List<Doctor> getAllDoctor(){
		return ddao.getAllDoctor();
	}
	
	public String deleteDoctor(Doctor d){
		return ddao.deleteDoctor(d);
	}
	
	public List<Doctor> suggestDoctor(Patient p,String date){
		List<Doctor> li=null;
		return li;
	}
	public Map<Patient, Appointments>viewPatientByDate(String appointmentdate){
		
		return null;
	}
}