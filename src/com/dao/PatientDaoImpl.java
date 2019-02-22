package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Patient;

@Repository
@Transactional
public class PatientDaoImpl implements PatientDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addProfile(Patient p) {
		sf.getCurrentSession().save(p);
		return "seccess";
	}

	@Override
	public List<Patient> getAllpatient() {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Patient p");
		List<Patient> li = q.list();
		return li;
	}

	@Override
	public Patient getPatientById(String id) {
		return (Patient)sf.getCurrentSession().get(Patient.class, id);
	}

	@Override
	public String deletePatient(Patient p) {
		sf.getCurrentSession().delete(p);
		return "success";
	}

	@Override
	public String updatepatient(Patient p) {
		sf.getCurrentSession().update(p);
		return "success";
	}

}
