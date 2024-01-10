package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.Models.Candidates;

public class TestAnnotaionCandidates {
 
	public static void main(String[] args) {
	Candidates p1=new Candidates(3,"Rutvik","Nashik");

	Candidates p2=new Candidates(4,"Aditya","Sambhajinagar");
	 SessionFactory sf = new Configuration().configure().buildSessionFactory();
      Session s1=sf.openSession();
      Transaction tr=s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		tr.commit();
		s1.close();
		
      
	}

}
