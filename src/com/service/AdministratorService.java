package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Patient;

public interface AdministratorService {
	public String addDoctor(Doctor d);
	public String updateDoctor(Doctor d);
	public List<Doctor> getAllDoctor();
	public String deleteDoctor(Doctor d);
	public List<Doctor> suggestDoctor(Patient p,String date);
	public Map<Patient, Appointments>viewPatientByDate(String appointmentdate);
	public Doctor getDoctorById(String doctorId ) ;
}
