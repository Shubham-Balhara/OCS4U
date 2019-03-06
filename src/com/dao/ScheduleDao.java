package com.dao;

import java.util.List;

import com.bean.Schedule;

public interface ScheduleDao {
	public String addSchedule(Schedule s);
	public List<Schedule> getAllSchedule();
	public List<Schedule> getAllScheduleByDoctor(String did);
	public String deleteSchedule(Schedule s);
	public String deleteScheduleByDoctor(String doctorId);
}
