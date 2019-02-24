package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Patient;

public interface PatientService {
	public String addAilmentDetail(Patient p);
	public String modifyAilmentDetail(Patient p);
	public List<Patient> viewAilmentDetails(String pid);
	public List<Doctor> viewListOfDoctor(String type);
	public List<Doctor> viewListOfDoctor(String type,String date);
	public String requestforAppointment(String doctorid,String appointmentdate);
	public Map<Appointments, Patient>viewAppointmentDetail(String patientid,String date);
}
