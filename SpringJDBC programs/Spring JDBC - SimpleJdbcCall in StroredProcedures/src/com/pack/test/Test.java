package com.pack.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.dao.CustomerDao;
import com.pack.dto.Customer;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pack/resource/applicationContext.xml");
		CustomerDao custDao = (CustomerDao) context.getBean("customerDao");
	
/*
 		Customer cust = new Customer();
		cust.setCid(1);
		cust.setCname("Babu");
		cust.setCage(24);
		cust.setCsal(54000);
		custDao.create(cust);
		System.out.println("Customer Inserted Successfully :"+cust.getCid());
		
		Customer cust1 = new Customer();
		
		cust1.setCid(2);
		cust1.setCname("Dudekula");
		cust1.setCage(22);
		cust1.setCsal(45000);
		custDao.create(cust1);
		System.out.println("Customer Inserted Successfully :"+cust1.getCid());
*/
		
/*		System.out.println("Custome salary :"+custDao.getCustSal(1));
		System.out.println("Custome salary :"+custDao.getCustSal(2));
*/
	
/*		Customer cust = new Customer();
		cust.setCid(1);
		cust.setCname("XXX");
		cust.setCage(100);
		cust.setCsal(10000);
		
		custDao.update(cust);
		System.out.println("Customer Updated Successfully");
*/
	
/*		custDao.delete(1);
		System.out.println("Deleted successfully");
*/
		
/*		Customer cust = custDao.getCustomerDetails(2);
		System.out.println("Customer Details");
		System.out.println("==========================");
		System.out.println("Customer id :"+cust.getCid());
		System.out.println("Cutomer Name:"+cust.getCname());
		System.out.println("Customer age:"+cust.getCage());
		System.out.println("Customer sal:"+cust.getCsal());
		System.out.println("==========================");
				
*/
/*		List<Customer> cust = custDao.getAllCustomer();
		System.out.println("cid\tcname\tcage\tcsal");
		System.out.println("=================================");
		for(Customer cus :cust)
		{
			System.out.print(cus.getCid()+"\t");
			System.out.print(cus.getCname()+"\t");
			System.out.print(cus.getCage()+"\t");
			System.out.println(cus.getCsal());
		}	
*/		
	}
}










