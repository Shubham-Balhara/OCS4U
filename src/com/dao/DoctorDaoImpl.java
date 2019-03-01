package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Doctor;

@Repository
@Transactional
public class DoctorDaoImpl implements DoctorDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addDoctor(Doctor d) {
		sf.getCurrentSession().save(d);
		return "success";
	}

	@Override
	public List<Doctor> getAllDoctor() {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Doctor d");
		List<Doctor> li = q.list();
		return li;
	}

	@Override
	public Doctor getDoctorById(String id) {
		Session session = sf.getCurrentSession();
		Doctor d = (Doctor)session.get(Doctor.class, id);
		return d;
	}

	@Override
	public String deleteDoctor(Doctor d) {
		sf.getCurrentSession().delete(d);
		return "success";
	}

	@Override
	public String updateDoctor(Doctor d) {
		sf.getCurrentSession().update(d);
		return "success";
	}

	@Override
	public List<Doctor> getAllDoctorByType(String type) {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Doctor where specialization=:type");
		q.setParameter("type", type);
		List<Doctor> li = q.list();
		return li;
	}

}
