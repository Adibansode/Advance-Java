package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.User;

public class DaoImpl implements Idao{
	 static SessionFactory sf;
	    static {
	    	sf=HibernateUtil.getMySessionFactory();
	    }
  
	public void save(User u1) {
	 Session s1=sf.openSession();
	 Transaction tr=s1.beginTransaction();
	 s1.save(u1);
	 tr.commit();
	 s1.close();
	}

	public List<User> FindAll() {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		//HQL Query --
		Query query=s1.createQuery("from User");
		List<User>ul=query.list();
		tr.commit();
		s1.close();
		return ul;
	}

	public boolean DeletByID(int id) {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		User u =s1.get(User.class, id);
		if(u!=null)
		{   
			s1.delete(u);
			tr.commit();
			s1.close();
			return true;
		}
		
		return false;
	}

	public User findbyid(int uid) {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		User u =s1.get(User.class, uid);
		tr.commit();
		s1.close();
		return u;
	}

	public boolean changebyid(int id1, String nm, String str) {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		User u=s1.get(User.class, id1);
		if(u!=null) {
			u.setUname(nm);
			u.getAdd().setStreet(str);
			s1.update(u);
			tr.commit();
			s1.close();
			return true;
		}
		s1.close();
		return false;
	}

	public List<User> sortbyid() {
		Session s1=sf.openSession();
		Transaction tr=s1.beginTransaction();
		Query query=s1.createQuery("from User u order by u.uid");
		List<User> ulist=query.list();
		tr.commit();
		s1.close();
		return ulist;		
	}



}
