package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.*;
public class TestOnetoOneRetrival {

	public static void main(String[] args) {
		  
SessionFactory sf=(new Configuration().configure().buildSessionFactory());
		  Session s1=sf.openSession();
		  Transaction tr=s1.beginTransaction();
		//MyUser u1=sess.get(MyUser.class, 10);
			User u1=s1.load(User.class, 1);
			System.out.println("before");
			System.out.println(u1.getUname());
			System.out.println("after name");
			System.out.println(u1.getAddr());
			System.out.println("after");
	
	}

}
