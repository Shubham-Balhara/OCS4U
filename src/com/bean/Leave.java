package com.bean;

public class Leave {
	private String reporterId ;
	private String reporterName ;
	private String doctorId ;
	private String leaveFrom ;
	private String leaveTo ;
	private String reason ;
	private String status ;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(String reporterId, String reporterName, String doctorId,
			String leaveFrom, String leaveTo, String reason, String status) {
		super();
		this.reporterId = reporterId;
		this.reporterName = reporterName;
		this.doctorId = doctorId;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.reason = reason;
		this.status = status;
	}
	public String getReporterId() {
		return reporterId;
	}
	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}
	public String getReporterName() {
		return reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getLeaveFrom() {
		return leaveFrom;
	}
	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	public String getLeaveTo() {
		return leaveTo;
	}
	public void setLeaveTo(String leaveTo) {
		this.leaveTo = leaveTo;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LeaveBean [reporterId=" + reporterId + ", reporterName="
				+ reporterName + ", doctorId=" + doctorId + ", leaveFrom="
				+ leaveFrom + ", leaveTo=" + leaveTo + ", reason=" + reason
				+ ", status=" + status + "]";
	}
	
	

}
