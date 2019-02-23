package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Credentials;

@Repository
@Transactional
public class CredentialsDaoImpl implements CredentialsDao {
	@Autowired
	SessionFactory sf;
	
	@Override
	public String addCredentials(Credentials c) {
		sf.getCurrentSession().save(c);
		return "success";
	}

	@Override
	public List<Credentials> getAllCredentials() {
		Session session = sf.getCurrentSession();
		Query q = session.createQuery("from Credentials c");
		List<Credentials> li = q.list();
		return li;
	}

	@Override
	public Credentials getCredentialsById(String id) {
		/*Session session = sf.getCurrentSession();
		if(type[0] != null){
			Query q = session.createQuery("from Credentials c where userId=:id and userType=:type");
			q.setParameter("id", id);
			q.setParameter("type", type);
			List<Credentials> li = q.list();
			return li.get(0);
		}*/
		return (Credentials)sf.getCurrentSession().get(Credentials.class, id);
	}

	@Override
	public String deleteCredentials(Credentials c) {
		sf.getCurrentSession().delete(c);
		return "success";
	}

	@Override
	public String updateCredentials(Credentials c) {
		sf.getCurrentSession().update(c);
		return "success";
	}

}
