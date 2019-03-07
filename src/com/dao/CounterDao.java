package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Counter;

@Repository
@Transactional
public class CounterDao {
	@Autowired
	SessionFactory sf;
	
	public Counter getCounter(){
		return (Counter)sf.getCurrentSession().get(Counter.class, 1);
	}
	
	public String updateCounter(Counter c){
		sf.getCurrentSession().update(c);
		return "success";
	}
}
