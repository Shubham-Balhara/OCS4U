package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedules")
public class Schedule {
	@Id
	private String scheduleId ;
	private String doctorId ;
	private String availableDays ;
	private String slots ;
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(String doctorId,
			String availableDays, String slots) {
		super();
		this.doctorId = doctorId;
		this.availableDays = availableDays;
		this.slots = slots;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	@Override
	public String toString() {
		return "ScheduleBean [scheduleId=" + scheduleId + ", doctorId="
				+ doctorId + ", availableDays=" + availableDays + ", slots="
				+ slots + "]";
	}
	

}
