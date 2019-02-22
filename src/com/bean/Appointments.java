package com.bean;

public class Appointments {
	private String appointmentId;
	private String doctorId;
	private String patientId;
	private String  appointmentDate ;
	private String appointmentTime ;
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointments(String appointmentId, String doctorId,
			String patientId, String appointmentDate, String appointmentTime) {
		super();
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
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
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	@Override
	public String toString() {
		return "AppointmentBean [appointmentId=" + appointmentId
				+ ", doctorId=" + doctorId + ", patientId=" + patientId
				+ ", appointmentDate=" + appointmentDate + ", appointmentTime="
				+ appointmentTime + "]";
	}

	
}
