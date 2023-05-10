package com.pack.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.pack.pojo.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	@Override
	public String add(Customer customer) 
	{
		String status="";
		try 
		{
			Customer emp1 = (Customer)hibernateTemplate.get(Customer.class, customer.getCid());
			if(emp1 != null)
			{
				status ="Employee Existed Already";
			}
			else
			{
				int eno = (Integer) hibernateTemplate.save(customer);
				if(eno == customer.getCid())
				{
					status = "Employee Inserted Successfully";
				}
				else
				{
					status = "Employee Insertion Failure";
				}
			}
		} 
		catch (Exception e) 
		{
			status="Customer Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Customer search(int cid) 
	{
		Customer customer = null;
		try 
		{
			customer = hibernateTemplate.get(Customer.class, cid);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return customer;
	}

	@Transactional
	@Override
	public String update(Customer customer) 
	{
		String status="";
		try 
		{
			Customer cust = search(customer.getCid());
			if(cust == null)
			{
				status = "Customer Not Existed";
			}
			else
			{
				hibernateTemplate.evict(cust);
				hibernateTemplate.update(customer);
				status = "Customer Has Updated Successfully";
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public String delete(int cid) 
	{
		String status="";
		try 
		{
			Customer cust = search(cid);
			if(cust == null)
			{
				status = "Employee Not Existed";
			}
			else
			{
				hibernateTemplate.delete(cust);
				status ="Deletion Successfully completed";
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

}
