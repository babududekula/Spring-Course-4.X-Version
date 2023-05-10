package com.pack.dao;

import com.pack.pojo.Customer;

public interface CustomerDao 
{
	public String add(Customer customer);
	public Customer search(int cid);
	public String update(Customer customer);
	public String delete(int cid);
	
}
