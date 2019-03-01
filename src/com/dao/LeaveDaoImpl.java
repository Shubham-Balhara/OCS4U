package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Leave;
@Repository
@Transactional
public class LeaveDaoImpl implements LeaveDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public String addLeave(Leave leave) {
		sessionFactory.getCurrentSession().save(leave);
		return "success";
	}

	@Override
	public List<Leave> getAllLeaveByDoctor(String doctorId) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Leave where doctorId=:did");
		q.setParameter("did", doctorId);
		List<Leave> li = q.list();
		return li;
		}

	@Override
	public boolean updateLeave(Leave leave) {
		// TODO Auto-generated method stub
		return false;
	}

}
