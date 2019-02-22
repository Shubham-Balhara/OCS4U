package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Profile;

@Repository
@Transactional
public class ProfileDaoImpl implements ProfileDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addProfile(Profile p) {
		sf.getCurrentSession().save(p);
		return "success";
	}

	@Override
	public List<Profile> getAllProfile() {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Profile p");
		List<Profile> li = q.list();
		return li;
	}

	@Override
	public Profile getProfileById(String id) {
		return (Profile)sf.getCurrentSession().get(Profile.class, id);
	}

	@Override
	public String deleteProfile(Profile p) {
		sf.getCurrentSession().delete(p);
		return "success";
	}

	@Override
	public String updateProfile(Profile p) {
		sf.getCurrentSession().update(p);
		return "success";
	}

}
