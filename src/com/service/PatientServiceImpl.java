package com.service;

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
		return appointmentDao.getAppointmentsByPatient(patientId);
	}

}
