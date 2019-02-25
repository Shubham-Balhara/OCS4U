package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Appointments;
import com.bean.Doctor;
import com.dao.AppointmentDao;

@Service
public class ReporterServiceImpl implements ReporterService {
	@Autowired
	AppointmentDao adao;
	static int index = 0;
	
	@Override
	public List<Doctor> viewAllDoctors(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> intimateAdmin(String date, String status) {
		return null;
	}

	@Override
	public List<Appointments> getAppointmentByDoctor(String did) {
		return adao.getAppointmentsByDoctor(did);
	}

	@Override
	public String addAppointment(Appointments a) {
		index++;
		String id = "APT";
		if(index<10){
			id += "00"+index;
		}else if(index<100){
			id+="0"+index;
		}else{
			id+=index;
		}
		a.setAppointmentId(id);
		//System.out.println(a.getPatientId()+" patient id in reporterservice");
		return adao.addAppointment(a);
	}
	
	@Override
	public boolean requestAppointment(Appointments a){
		List<Appointments> li = getAppointmentByDoctor(a.getDoctorId());
		for(Appointments ap:li){
			if(ap.getAppointmentDate().equals(a.getAppointmentDate()) && ap.getAppointmentSlot().equals(a.getAppointmentSlot()))
				return false;
		}
		addAppointment(a);
		return true;
	}

}
