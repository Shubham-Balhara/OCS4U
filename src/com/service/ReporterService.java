package com.service;

import java.util.List;

import com.bean.Appointments;
import com.bean.Doctor;

public interface ReporterService {
	public List<Doctor> viewAllDoctors(String date);
	public List<Doctor> intimateAdmin(String date,String status);
	public List<Appointments> getAppointmentByDoctor(String did); 
	public String addAppointment(Appointments a);
	public List<Appointments> requestAppointment(String doctorId, String userId);
}
