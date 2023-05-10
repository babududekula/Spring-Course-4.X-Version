package com.pack.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import com.pack.entity.Employee;

public class Test 
{

	public static void main(String[] args) throws Exception
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		
	/*	
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		Employee emp = new Employee();
		emp.setEno(222);
		emp.setEname("AAA");
		emp.setEsal(30000);
		emp.setEaddr("Nellore");
		
		manager.persist(emp);
		transcation.commit();
		System.out.println("Employee Inserted Successfully");
	*/
		
	/*	Employee emp = manager.find(Employee.class, 222);
		System.out.println("Employee Details");
		System.out.println("==============");
		System.out.println("Employee number :"+emp.getEno());
		System.out.println("Employee name   :"+emp.getEname());
		System.out.println("Employee Salary :"+emp.getEsal());
		System.out.println("employee Adddres:"+emp.getEaddr());
		System.out.println();
	*/
		
	/*	EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		Employee emp = manager.find(Employee.class, 222);
		emp.setEname("ccc");
		emp.setEsal(40000);
		emp.setEaddr("Tirupati");
		transcation.commit();
		System.out.println("Updated successfully");
	*/
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class,222);
		manager.remove(emp);
		transaction.commit();
		
		manager.close();

	}

}






