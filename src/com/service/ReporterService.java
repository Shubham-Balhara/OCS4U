package com.service;

import java.util.List;

import com.bean.Appointments;
import com.bean.Doctor;
import com.bean.Leave;
import com.bean.Report;

public interface ReporterService {
	public List<Doctor> viewAllDoctors(String date);
	public List<Doctor> intimateAdmin(String date,String status);
	public List<Appointments> getAppointmentByDoctor(String did); 
	public String addAppointment(Appointments a);
	public List<Appointments> requestAppointment(String doctorId, String userId);
	public List<Doctor> getAllDoctors();
	public String addLeave(Leave leave);
	public List<Leave> getLeaveByDoctor(String doctorId);
	public List<Appointments> reschedule(String aip);
	public String updateAppointment(Appointments a);
	public Appointments getAppointmentByAid(String aid);
	public List<Appointments> getUnallocatedAppointment();
	public List<Appointments> reallocate(String appointmentId);
	public List<Appointments> pendingReport();
	public String addReport(Report r);
	public Report getReportById(String reportId);
	public List<Report> getReportByPatient(String pid);
}
