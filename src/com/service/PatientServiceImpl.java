package com.service;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.engine.jdbc.internal.DDLFormatterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Patient;
import com.dao.AppointmentDao;
import com.dao.DoctorDao;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	DoctorDao ddao;
	@Autowired
	AppointmentDao appointmentDao;

	@Override
	public String addAilmentDetail(Patient p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifyAilmentDetail(Patient p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> viewAilmentDetails(String pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> viewListOfDoctor(String type) {
		return ddao.getAllDoctorByType(type);
	}
	
	@Override
	public List<Doctor> viewListOfDoctor(String type, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String requestforAppointment(String doctorid, String appointmentdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Appointments, Patient> viewAppointmentDetail(String patientid,
			String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointments> getAppointmentsById(String patientId) {
		List<Appointments> li = appointmentDao.getAppointmentsByPatient(patientId);
		Collections.sort(li);
		List<Appointments> appointments = new ArrayList<Appointments>();
		for(Appointments a:li){
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			if(a.getAppointmentDate().compareTo(new SimpleDateFormat("yyyy-MM-dd").format(new Date()))>=0){
				appointments.add(a);
			}
		}
		return appointments;
	}
	@Override
	public List<Appointments> getReportById(String patientId) {
		List<Appointments> li = appointmentDao.getAppointmentsByPatient(patientId);
		Collections.sort(li);
		List<Appointments> appointments = new ArrayList<Appointments>();
		for(Appointments a:li){
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			if(a.getAppointmentDate().compareTo(new SimpleDateFormat("yyyy-MM-dd").format(new Date()))<0){
				appointments.add(a);
			}
		}
		return appointments;
	}

}
