package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Patient;
import com.dao.AppointmentDao;
import com.dao.DoctorDao;
import com.dao.ScheduleDao;

@Service
public class AdministratorServiceImpl implements AdministratorService {
	@Autowired
	DoctorDao ddao;
	@Autowired
	AppointmentDao appointmentDao;
	@Autowired
	ScheduleDao scheduledao;
	static int index = 25;
	
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
		scheduledao.deleteScheduleByDoctor(d.getDoctorId());
		return ddao.deleteDoctor(d);
	}
	
	public List<Doctor> suggestDoctor(Patient p,String date){
		List<Doctor> li=null;
		return li;
	}
	public Map<Patient, Appointments>viewPatientByDate(String appointmentdate){
		
		return null;
	}

	@Override
	public Doctor getDoctorById(String doctorId) {
		return ddao.getDoctorById(doctorId) ;
		
	}

	@Override
	public List<Appointments> getAppointmentsByDoctorId(String doctorId) {
		return appointmentDao.getAppointmentsByDoctor(doctorId);
	}

}

