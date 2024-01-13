package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.model.*;
public class TestSingleTable {

	public static void main(String[] args) {
		
		WageEmployee w1=new WageEmployee(1,"Atharva","Tester",64577);
		WageEmployee w2=new WageEmployee(2,"Aditya","Senior Developer",25000);
		ContractEmployee c1=new ContractEmployee(3,"Malode","Hr",8,2000);
		ContractEmployee c2=new ContractEmployee(4,"Prashant Sir","Ceo",24,5000);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		 Transaction tr=session.beginTransaction();
		 session.save(w1);
		 session.save(w2);
		 session.save(c1);
		 session.save(c2);
		 tr.commit();
		 session.close();

	}

}
