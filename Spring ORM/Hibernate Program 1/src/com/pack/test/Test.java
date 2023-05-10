package com.pack.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pack.entity.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		try 
		{
			Configuration configuration = new Configuration();
			configuration.configure("com/pack/resource/Student.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			// Add Module using save or persist (save will return object)
			
//			Student std = new Student();
//			std.setSid(333);
//			std.setSname("Hi");
//			std.setSaddr("Nellore");
//			Serializable save = session.save(std);
//			if(save.equals(333))
//			{
//				System.out.println("Success Good");
//			}
//			else
//			{
//				System.out.println("Sorry Bad logic");
//			}
//			transaction.commit();
//			System.out.println("Student Inserted Successfully");
			
			
			// ***** persist will not return any value *****
			
//			Student std = new Student();
//			std.setSid(333);
//			std.setSname("Hi");
//			std.setSaddr("Nellore");
//			session.persist(std);
//			
//			transaction.commit();
//			System.out.println("Student Inserted Successfully");
			
			
			// Search using get method and we can use load also
			
//			Student std = (Student) session.get(Student.class, 333);
//			if(std == null)
//			{
//				System.out.println("Student Not Existed");
//			}
//			else
//			{
//				System.out.println("Student Details");
//				System.out.println("===========================");
//				System.out.println("Student id  : "+std.getSid());
//				System.out.println("Student name: "+std.getSname());
//				System.out.println("Student addr: "+std.getSaddr());
//				System.out.println("===========================");
//			}
//			transaction.commit();
			
			
			// Update using SaveOrUpdate method
			
//			Student std = new Student();
//			std.setSid(444);
//			std.setSname("Hero");
//			std.setSaddr("Venkatagiri");
//			
//			session.saveOrUpdate(std);
//			transaction.commit();
//			
//			System.out.println("Employee Updated Successfully");
			
			
			// Delete Operation using delete method
			
//			Student std = new Student();
//			std.setSid(222);
//			
//			session.delete(std);
//			transaction.commit();
//			System.out.println("Student Deletd Successfully");
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			e.printStackTrace();
		}
		finally 
		{
			session.close();
			sessionFactory.close();
			
		}
	}
}
