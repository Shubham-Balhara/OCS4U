package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leaves")
public class Leave {
	@Id
	private String leaveId ;
	private String doctorId ;
	private String leaveFrom ;
	private String leaveTo ;
	private String reason ;
	private int status ;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Leave(String doctorId, String leaveFrom, String leaveTo,
			String reason, int status) {
		super();
		this.doctorId = doctorId;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.reason = reason;
		this.status = status;
	}

	public String getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LeaveBean [leaveId=" + leaveId + ", doctorId=" + doctorId + ", leaveFrom="
				+ leaveFrom + ", leaveTo=" + leaveTo + ", reason=" + reason
				+ ", status=" + status + "]";
	}
	
	

}
