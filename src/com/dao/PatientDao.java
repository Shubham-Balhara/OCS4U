package com.dao;

import java.util.List;

import com.bean.Patient;

public interface PatientDao {
	public String addProfile(Patient p);
	public List<Patient> getAllpatient();
	public Patient getPatientById(String id);
	public String deletePatient(Patient p);
	public String updatepatient(Patient p);
}
