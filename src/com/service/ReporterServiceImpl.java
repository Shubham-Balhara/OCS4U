package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Doctor;
import com.bean.Schedule;
import com.dao.ScheduleDao;

@Service
public class ReporterServiceImpl implements ReporterService {
	@Autowired
	ScheduleDao sdao;
	
	@Override
	public List<Doctor> viewAllDoctors(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> intimateAdmin(String date, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Schedule> getSchedulesByDoctor(String did) {
		return sdao.getAllScheduleByDoctor(did);
	}

}
