package com.bean;

public class ScheduleBean {
	private String scheduleId ;
	private String doctorId ;
	private String availableDays ;
	private String slots ;
	public ScheduleBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduleBean(String scheduleId, String doctorId,
			String availableDays, String slots) {
		super();
		this.scheduleId = scheduleId;
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
