package com.demo.Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.Models.*;
public class TestHibernate {

	public static void main(String[] args) {
     Cars c1=new Cars(1,"Seedan","Swift");
     Cars c2=new Cars(2,"hatchback","i20");
     Cars c3=new Cars(3,"Suv","Fortuner");
     
     Employee e1=new Employee(10,"atharva","developer",1510000);
     Employee e2=new Employee(20,"Aditya","Trader",155000);
     
     SessionFactory sf=new Configuration().configure().buildSessionFactory();
     Session session=sf.openSession();
     Transaction tr=session.beginTransaction();
     session.save(c1);
     session.save(c2);
     session.save(c3);
     tr.commit();
     session.close();
     
//     Employee Table
    
     Session s1=sf.openSession();
     Transaction tr1=s1.beginTransaction();
     Cars c4=s1.get(Cars.class, 2);
     System.out.println("before");
     Employee e3=s1.load(Employee.class, 4);
     System.out.println("before");
     System.out.println(e3.getEjob());
     System.out.println("After");
     s1.save(e1);
     s1.save(e2);
     tr1.commit();
     s1.close();
     
     

	}

}
