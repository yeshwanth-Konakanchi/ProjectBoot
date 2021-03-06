package com.journaldev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.journaldev.hibernate.model.Employee;
import com.journaldev.hibernate.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("dunky");
		emp.setRole("CEO");
		emp.setInsertTime(new Date());
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		//start transaction
		Transaction tx = session.beginTransaction();
		//Save the Model object
		session.save(emp);
//		session.save(emp);
//		session.flush();
		//Commit transaction
		tx.commit();
		System.out.println("Employee ID="+emp.getId());
		
		
		Session session1 = sessionFactory.openSession();
		//start transaction
		Transaction tx1 = session.beginTransaction();
		//Save the Model object
		session1.saveOrUpdate(emp);
//		session.save(emp);
//		session.flush();
		//Commit transaction
		tx1.commit();
		System.out.println("Employee ID="+emp.getId());
		
		
		sessionFactory.close();

		
		
		//terminate session factory, otherwise program won't end
		
	}

}
