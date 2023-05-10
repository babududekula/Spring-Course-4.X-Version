package com.pack.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pack.pojo.Bank;

@Repository("bankDao")
public class BankDaoImpl implements BankDao 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public String add(Bank bank) 
	{
		String status ="";
		try 
		{
			Bank b = entityManager.find(Bank.class, bank.getBname());
			if(b == null)
			{
				entityManager.persist(bank);
				status="Successfully Added To DataBase";
			}
			else
			{
				status ="Bank Name Already Inserted";
			}
		} 
		catch (Exception e) 
		{
			status="Failed To Insert Data into DataBase";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Bank serach(String bname) 
	{
		Bank bank = null;
		try 
		{
			bank = entityManager.find(Bank.class, bname);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return bank;
	}

	@Transactional
	@Override
	public String update(Bank bank) 
	{
		String status = "";
		try 
		{
			Bank bank1 = serach(bank.getBname());
			if(bank1 != null)
			{
				bank1.setBid(bank.getBid());
				bank1.setBaccount(bank.getBaccount());
				bank1.setBbalance(bank.getBbalance());
				bank1.setBbranch(bank.getBbranch());
				status = "Successfully Updated";
			}
			else
			{
				status="Bank Not Available To Do Update";
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
	public String delete(String bname) 
	{
		String status="";
		try 
		{
			Bank bank = serach(bname);
			if(bank != null)
			{
				entityManager.remove(bank);
				status="Deletion Success";
			}
			else
			{
				status ="Bank Not Existed To Delete";
			}
		} 
		catch (Exception e) 
		{
			status = "Bank Deletion Failure";
		}
		return status;
	}

}
