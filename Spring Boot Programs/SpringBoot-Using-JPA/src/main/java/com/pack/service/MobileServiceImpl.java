package com.pack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.TableGenerator;
import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.MobileDao;
import com.pack.pojo.Mobile;

@Service
public class MobileServiceImpl implements MobileService
{

	@Autowired
	private MobileDao mobileDao;
	
	@Transactional
	@Override
	public String add(Mobile mobile) 
	{
		String status="";
		try 
		{
			boolean existsById = mobileDao.existsById(mobile.getMobileName());
			if(existsById == true)
			{
				status="This Mobile Brand is Already Given";
			}
			else
			{
				Mobile.isNew=true;
				Mobile mobile1 = mobileDao.save(mobile);
				if(mobile1 == null)
				{
					status="Failure To Save Mobile Brand";
				}
				else
				{
					status=" Your New Mobile is Added Successfully";
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Mobile search(String mobileName) 
	{
		Mobile mobile = null;
		mobile = mobileDao.findById(mobileName).get();
		return mobile;
	}

	@Override
	public String update(Mobile mobile) 
	{
		String status="";
		try 
		{
			boolean existsById = mobileDao.existsById(mobile.getMobileName());
			if(existsById == true)
			{
				Mobile.isNew=false;
				Mobile mobile1 = mobileDao.save(mobile);
				if(mobile1 == null)
				{
					status="Failure To Update Mobile Brand";
				}
				else
				{
					status=" Your Old Mobile is Updated Successfully";
				}
			}
			else
			{
				status="Not Found Mobile Brand To Update";
				
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public List<Mobile> getAllEmployees() 
	{
		List<Mobile> listAll = new ArrayList<>();
		mobileDao.findAll().forEach(list -> listAll.add(list));
		return listAll;
	}

	@Override
	public String delete(String mobileName) 
	{
		String status="";
		try 
		{
			Optional<Mobile> op1 = mobileDao.findById(mobileName);
			if(op1.isEmpty() == true)
			{
				status="Not Existed Mobile To Delete";
			}
			else
			{
				mobileDao.deleteById(mobileName);
				status="Mobile Deleted Successfully";
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

}
