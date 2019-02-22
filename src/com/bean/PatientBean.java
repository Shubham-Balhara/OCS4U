package com.bean;

public class PatientBean {
	private String patientId;
	private String appointmentDate;
	private String ailmentType;
	private String ailmentDetails;
	private String diagnosisHistory;

	public PatientBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientBean(String patientId, String appointmentDate,
			String ailmentType, String ailmentDetails, String diagnosisHistory) {
		super();
		this.patientId = patientId;
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

	@Override
	public String toString() {
		return "PatientBean [patientId=" + patientId + ", appointmentDate="
				+ appointmentDate + ", ailmentType=" + ailmentType
				+ ", ailmentDetails=" + ailmentDetails + ", diagnosisHistory="
				+ diagnosisHistory + "]";
	}

}
