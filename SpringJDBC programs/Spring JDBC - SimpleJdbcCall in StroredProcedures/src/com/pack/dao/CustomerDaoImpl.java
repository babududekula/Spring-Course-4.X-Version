
/*
 create or replace procedure getSal(no IN number , sal OUT number)
 As
 Begin
 	select csal into sal from customer where cid = no;
 End getSal; 
 /
 */

/*
 create or replace procedure insertCustomers(no IN number , name IN varchar2 , age IN number ,sal IN float ) 
 As
 Begin
 	insert into customer values(no , name , age , sal);
 End insertCustomers;
 /
 */

/*
 create or replace procedure updateCustomer(no IN number , name IN varchar2 , age IN number , sal IN float)
 As
 Begin
 	update customer set cname = name , cage = age , csal = sal where cid = no;
 End updateCustomer;
 /
 */

/*
 create or replace procedure deleteCustomer(no IN number)
 As
 Begin
 	delete from Customer where cid = no;
 End deleteCustomer;
 /	
 	
 */

/*
 create or replace procedure getCustomer(no In number , customer OUT SYS_REFCURSOR)
 AS
 Begin
 	open customer for
 		select * from customer where cid = no;
 End getCustomer;
 / 
 */

/*
 create or replace procedure getAllCustomers(customer OUT SYS_REFCURSOR)
 As
 Begin
 	open customer for
 		select * from customer;
 End getAllCustomers;
 /
 */

package com.pack.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.pack.dto.Customer;

public class CustomerDaoImpl implements CustomerDao 
{
	
	private DataSource dataSource;
	private SimpleJdbcCall simpleJdbcCall;
	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		simpleJdbcCall = new SimpleJdbcCall(dataSource);
	}
	@Override
	public void create(Customer cust) 
	{
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("insertCustomers");
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("no", cust.getCid());
			params.put("name", cust.getCname());
			params.put("age", cust.getCage());
			params.put("sal", cust.getCsal());
			
			simpleJdbcCall.execute(params);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	@Override
	public Object getCustSal(int cid) 
	{
		Object sal = null;
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("getSal");
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("no", cid);
			Map<String, Object> new_Value = simpleJdbcCall.execute(params);
			sal = new_Value.get("SAL");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return sal;
	}
	@Override
	public void update(Customer cust) 
	{
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("updateCustomer");
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("no", cust.getCid());
			params.put("name", cust.getCname());
			params.put("age", cust.getCage());
			params.put("sal", cust.getCsal());
			
			simpleJdbcCall.execute(params);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void delete(int cid) 
	{
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("deleteCustomer");
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("no", cid);
			simpleJdbcCall.execute(params);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Customer getCustomerDetails(int cid) 
	{
		Customer cust = null;
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("getCustomer");
			simpleJdbcCall = simpleJdbcCall.returningResultSet("customer", BeanPropertyRowMapper.newInstance(Customer.class));
			
			Map<String, Object> params = new HashMap<String , Object>();
			params.put("no", cid);
			Map<String, Object> new_values = simpleJdbcCall.execute(params);
			ArrayList<Customer> list = (ArrayList<Customer>) new_values.get("customer");
			cust = list.get(0);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cust;
		
	}
	@Override
	public List<Customer> getAllCustomer() 
	{
		List<Customer> cust = null;
		try 
		{
			simpleJdbcCall = simpleJdbcCall.withProcedureName("getAllCustomers");
			simpleJdbcCall = simpleJdbcCall.returningResultSet("customer", BeanPropertyRowMapper.newInstance(Customer.class));
			Map<String, Object> params = simpleJdbcCall.execute();
			cust = (List<Customer>) params.get("customer");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cust;
	}

}










