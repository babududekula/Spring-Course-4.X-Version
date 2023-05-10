package com.pack.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pack.beans.Account;


public class AccountDaoImpl implements AccountDao
{

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	@Transactional
	@Override
	public String transferAmount(String fromAccount, String toAccount, int amount) 
	{
		String status="";
		int debitRowCount = debit(fromAccount, amount);
	//	float f = 100/0;
		int creditRowCount = credit(toAccount, amount);
		if(debitRowCount == 1 && creditRowCount == 1)
		{
			status = "Success";
		}
		else
		{
			status = "Failure";
		}
		return status;
	}
	public int debit(String name , int balance)
	{
		int RowCount = jdbcTemplate.update("update account set balance = balance - "+balance+" where accno = '"+name+"' ");
		System.out.println("Amount is debited from "+name+"");
		return RowCount;
	}
	public int credit(String name , int balance)
	{
		int RowCount = jdbcTemplate.update("update account set balance = balance + "+balance+" where accno = '"+name+"'");
		System.out.println("Amount is credited to "+name+" ");
		return RowCount;
	}
	@Override
	public String deposite(String fromAccount, int amount) 
	{
		String status="";
		int RowCount = credit(fromAccount, amount);
		if(RowCount == 1)
		{
			status = "Success";
		}
		else
		{
			status = "Failure";
			throw new RuntimeException("Insufficient Details in the Transaction");
		}
		return status;
	}
	@Override
	public String withDraw(String toAccount, int amount) 
	{
	/*
		String status ="";
		int RowCount = debit(toAccount, amount);
		if(RowCount == 1)
		{
			status = "Success";
		}
		else
		{
			status = "Failure";
			throw new RuntimeException("Insufficent Account Number You have Given");
		}
		return status;
	*/
		String status="";
		String query = "select * from account where accno = '"+toAccount+"' ";
		List<Object> list = jdbcTemplate.query(query,(rs,index)->{
			Account acc = new Account();
			acc.setAccno(rs.getString("accno"));
			acc.setBalance(rs.getInt("balance"));
			return acc;
		});
			int balance = ((Account)list.get(0)).getBalance();
			if(balance < amount)
			{
				status = "Transaction Failure";
				throw new RuntimeException("Insufficient funds in your account");
			}
			else
			{
				int RowCount = debit(toAccount, balance);
				if(RowCount == 1)
				{
					status = "Success";
				}
				else
				{
					status = "Failure";
				}
			}
		
		return status;
	}
	
}








