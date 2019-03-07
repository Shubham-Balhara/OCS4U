package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counter")
public class Counter {
	@Id
	private int id ;
	private int doctorCount;
	private int userCount;
	private int leaveCount;
	private int appointmentCount;

	public Counter() {
	}

	public Counter(int doctorCount, int userCount, int leaveCount,
			int appointmentCount) {
		super();
		this.doctorCount = doctorCount;
		this.userCount = userCount;
		this.leaveCount = leaveCount;
		this.appointmentCount = appointmentCount;
	}

	public int getDoctorCount() {
		return doctorCount;
	}

	public void setDoctorCount(int doctorCount) {
		this.doctorCount = doctorCount;
	}

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}

	public int getAppointmentCount() {
		return appointmentCount;
	}

	public void setAppointmentCount(int appointmentCount) {
		this.appointmentCount = appointmentCount;
	};

}
