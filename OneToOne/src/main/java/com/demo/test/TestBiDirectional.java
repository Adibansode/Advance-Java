package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.Model2.Course;
import com.demo.Model2.faculty;

public class TestBiDirectional {
	public static void main(String[] args) {
		
		faculty addr=new faculty();
		addr.setFid(1);
		addr.setFname("Ravi");
		faculty addr1=new faculty(2,"saleel");
		Course u1=new Course(10,"xxx",addr);
		Course u2=new Course(11,"yyy",addr1);
		addr.setC(u1);
		addr1.setC(u2);
		  SessionFactory sf=(new Configuration().configure().buildSessionFactory());
		  Session s1=sf.openSession();
		  Transaction tr=s1.beginTransaction();
		  s1.save(addr);
			s1.save(addr1);
			s1.save(u1);
		   s1.save(u2);
		  tr.commit();
		  s1.close();
		
	}

}
