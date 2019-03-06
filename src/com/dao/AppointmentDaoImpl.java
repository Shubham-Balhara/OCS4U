package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Appointments;

@Repository
@Transactional
public class AppointmentDaoImpl implements AppointmentDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addAppointment(Appointments a) {
		sf.getCurrentSession().save(a);
		return "success";
	}

	@Override
	public List<Appointments> getAppointmentsByDoctor(String doctorId) {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Appointments where doctorId=:did");
		q.setParameter("did", doctorId);
		List<Appointments> li = q.list();
		return li;
	}

	@Override
	public List<Appointments> getAppointmentsByPatient(String patientId) {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Appointments where patientId=:pid");
		q.setParameter("pid", patientId);
		List<Appointments> li = q.list();
		return li;
	}

	@Override
	public String deleteAppointment(Appointments a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointments getAppointmentById(String aid) {
		Session session = sf.getCurrentSession();
		return (Appointments)session.get(Appointments.class, aid);
	}

	@Override
	public String updateAppointment(Appointments a) {
		sf.getCurrentSession().update(a);
		return "success";
	}

}
