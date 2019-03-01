package com.dao;

import java.util.List;

import com.bean.Leave;

public interface LeaveDao {
	public String addLeave(Leave leave);
	public List<Leave> getAllLeaveByDoctor(String doctorId);
	public boolean updateLeave(Leave leave);
}
