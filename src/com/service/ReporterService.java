package com.service;

import java.util.List;

import com.bean.Doctor;
import com.bean.Schedule;

public interface ReporterService {
	public List<Doctor> viewAllDoctors(String date);
	public List<Doctor> intimateAdmin(String date,String status);
	public List<Schedule> getSchedulesByDoctor(String did); 
}
