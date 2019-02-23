package com.service;

import java.util.List;

import com.bean.Doctor;

public interface ReporterService {
	public List<Doctor> viewAllDoctors(String date);
	public List<Doctor> intimateAdmin(String date,String status);
}
