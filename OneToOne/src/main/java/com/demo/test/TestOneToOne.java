package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;
public class TestOneToOne {

	public static void main(String[] args) {
		
  Address ad1=new Address(1,"Gangaves","Sinnar");
  Address ad2=new Address(2,"Panchvati","Nashik");
  Address ad3=new Address(3,"cidco","Sambhajinagar");
  User u1= new User(1,"Atharva",ad1);
  User u2= new User(2,"Aditya",ad2);
  User u3= new User(3,"Bhushan",ad3);
  
  SessionFactory sf=(new Configuration().configure().buildSessionFactory());
  Session s1=sf.openSession();
  Transaction tr=s1.beginTransaction();
  s1.save(ad1);
  s1.save(ad2);
  s1.save(ad3);
  s1.save(u1);
  s1.save(u2);
  s1.save(u3);
  tr.commit();
  s1.close();
}
}
