package com.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Schedule;
import com.dao.AppointmentDao;
import com.dao.ScheduleDao;

@Service
public class ReporterServiceImpl implements ReporterService {
	@Autowired
	AppointmentDao adao;
	@Autowired
	ScheduleDao scheduleDao;
	static int index = 5;
	
	@Override
	public List<Doctor> viewAllDoctors(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> intimateAdmin(String date, String status) {
		return null;
	}

	@Override
	public List<Appointments> getAppointmentByDoctor(String did) {
		return adao.getAppointmentsByDoctor(did);
	}

	@Override
	public String addAppointment(Appointments a) {
		index++;
		String id = "APT";
		if(index<10){
			id += "00"+index;
		}else if(index<100){
			id+="0"+index;
		}else{
			id+=index;
		}
		a.setAppointmentId(id);
		//System.out.println(a.getPatientId()+" patient id in reporterservice");
		return adao.addAppointment(a);
	}
	
	@Override
	public List<Appointments> requestAppointment(String doctorId,String userId){
		Calendar cal = Calendar.getInstance();
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("sunday", 1);mp.put("monday", 2);mp.put("tuesday", 3);mp.put("wednesday", 4);mp.put("thrusday", 5);mp.put("firday", 6);mp.put("saturday", 7);
		
		List<Schedule> schedules = scheduleDao.getAllScheduleByDoctor(doctorId);
		List<String> days = new ArrayList<String>();
		
		for(int i=0;i<3;i++){
			cal.setTime(new Date());
			cal.add(Calendar.DAY_OF_MONTH, -i);
			days.add(new SimpleDateFormat("EEEE").format(cal.getTime()).toLowerCase());
		}
		
		List<Schedule> safeSchedules = new ArrayList<Schedule>();
		for(Schedule s:schedules){
			if(!days.contains(s.getAvailableDays())){
				safeSchedules.add(s);
			}
		}
		
		List<Appointments> appointments = new ArrayList<Appointments>();
		for(Schedule s:schedules){
			cal.setTime(new Date());
			int day = mp.get(s.getAvailableDays());
			int gap = day - cal.get(Calendar.DAY_OF_WEEK);
			if(gap<0){
				gap = 7+gap;
			}
			cal.add(Calendar.DAY_OF_MONTH, gap);
			appointments.add(new Appointments(doctorId, "TM"+userId, new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()), s.getSlots()));
		}
		List<Appointments> presentAppointments = adao.getAppointmentsByDoctor(doctorId);
		List<Appointments> availableAppointments = new ArrayList<Appointments>();
		outter:
		for(Appointments a:appointments){
			for(Appointments b:presentAppointments){
				if(a.getAppointmentDate().equals(b.getAppointmentDate()) && a.getAppointmentSlot().equals(b.getAppointmentSlot())){
					continue outter;
				}	
			}
			availableAppointments.add(a);
		}
		
		return availableAppointments;
		
	}

}
