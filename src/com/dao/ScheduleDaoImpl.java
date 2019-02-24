package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Schedule;

@Repository
@Transactional
public class ScheduleDaoImpl implements ScheduleDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addSchedule(Schedule s) {
		sf.getCurrentSession().save(s);
		return "success";
	}

	@Override
	public List<Schedule> getAllSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Schedule> getAllScheduleByDoctor(String did) {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Schedule where doctorId=:did");
		q.setParameter("did", did);
		List<Schedule> li = q.list();
		return li;
	}

	@Override
	public String deleteSchedule(Schedule s) {
		// TODO Auto-generated method stub
		return null;
	}

}
