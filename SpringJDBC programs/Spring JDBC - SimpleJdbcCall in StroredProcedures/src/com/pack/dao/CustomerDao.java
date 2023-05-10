package com.pack.dao;

import java.util.List;

import com.pack.dto.Customer;

public interface CustomerDao 
{
	public void create(Customer cust);
	public Object getCustSal(int cid);
	public Customer getCustomerDetails(int cid);
	public void update(Customer cust);
	public void delete(int cid);
	public List<Customer> getAllCustomer();
}
