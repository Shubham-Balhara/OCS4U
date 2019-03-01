package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointments")
public class Appointments {
	@Id
	private String appointmentId;
	private String doctorId;
	private String patientId;
	private String  appointmentDate ;
	private String appointmentSlot ;
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointments(String doctorId,
			String patientId, String appointmentDate, String appointmentSlot) {
		super();
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.appointmentDate = appointmentDate;
		this.appointmentSlot = appointmentSlot;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentSlot() {
		return appointmentSlot;
	}
	public void setAppointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}
	@Override
	public String toString() {
		return "AppointmentBean [appointmentId=" + appointmentId
				+ ", doctorId=" + doctorId + ", patientId=" + patientId
				+ ", appointmentDate=" + appointmentDate + ", appointmentSlot="
				+ appointmentSlot + "]";
	}

	
}
