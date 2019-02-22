package com.dao;

import java.util.List;

import com.bean.Doctor;

public interface DoctorDao {
	public String addDoctor(Doctor d);
	public List<Doctor> getAllDoctor();
	public Doctor getDoctorById(String id);
	public String deleteDoctor(Doctor d);
	public String updateDoctor(Doctor d);
}
