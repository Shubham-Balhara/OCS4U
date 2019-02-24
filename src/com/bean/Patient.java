package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	private String patientId;
	private String userId;
	private String appointmentDate;
	private String ailmentType;
	private String ailmentDetails;
	private String diagnosisHistory;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String userId, String appointmentDate,
			String ailmentType, String ailmentDetails, String diagnosisHistory) {
		super();
		this.userId = userId;
		this.appointmentDate = appointmentDate;
		this.ailmentType = ailmentType;
		this.ailmentDetails = ailmentDetails;
		this.diagnosisHistory = diagnosisHistory;
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

	public String getAilmentType() {
		return ailmentType;
	}

	public void setAilmentType(String ailmentType) {
		this.ailmentType = ailmentType;
	}

	public String getAilmentDetails() {
		return ailmentDetails;
	}

	public void setAilmentDetails(String ailmentDetails) {
		this.ailmentDetails = ailmentDetails;
	}

	public String getDiagnosisHistory() {
		return diagnosisHistory;
	}

	public void setDiagnosisHistory(String diagnosisHistory) {
		this.diagnosisHistory = diagnosisHistory;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PatientBean [patientId=" + patientId + ", appointmentDate="
				+ appointmentDate + ", ailmentType=" + ailmentType
				+ ", ailmentDetails=" + ailmentDetails + ", userId =" + userId + ", diagnosisHistory="
				+ diagnosisHistory + "]";
	}

}
