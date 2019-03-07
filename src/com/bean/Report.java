package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "report")
public class Report {
	@Id
	private String id;
	private String appointmentDate;
	private String appointmentSlot;
	private String doctor;
	private String patient;
	private String ailments;
	private String medicines;

	public Report() {
	}

	public String getAilments() {
		return ailments;
	}

	public void setAilments(String ailments) {
		this.ailments = ailments;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public Report(String id, String appointmentDate, String appointmentSlot,
			String doctor, String patient, String ailments, String medicines) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentSlot = appointmentSlot;
		this.doctor = doctor;
		this.patient = patient;
		this.ailments = ailments;
		this.medicines = medicines;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getappointmentSlot() {
		return appointmentSlot;
	}

	public void setappointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

}
