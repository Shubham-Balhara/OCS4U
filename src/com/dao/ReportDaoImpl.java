package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Report;
@Repository
@Transactional
public class ReportDaoImpl implements ReportDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public String addReport(Report r) {
		sf.getCurrentSession().save(r);
		return "success";
	}

	@Override
	public Report getReportById(String id) {
		return (Report)sf.getCurrentSession().get(Report.class, id);
	}

	@Override
	public List<Report> getAllReporter() {
		Query q = sf.getCurrentSession().createQuery("from Report");
		return q.list();
	}

}
