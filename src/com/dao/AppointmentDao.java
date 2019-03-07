package com.dao;

import java.util.List;

import com.bean.Appointments;

public interface AppointmentDao {
	public String addAppointment(Appointments a);
	public List<Appointments> getAppointmentsByDoctor(String doctorId);
	public List<Appointments> getAppointmentsByPatient(String patientId);
	public String deleteAppointment(Appointments a);
	public Appointments getAppointmentById(String aid);
	public String updateAppointment(Appointments a);
	public List<Appointments> getAllAppointments();
	public List<Appointments> getAppointmentsBetweenDates(String from,String to,String doctorId);
}
