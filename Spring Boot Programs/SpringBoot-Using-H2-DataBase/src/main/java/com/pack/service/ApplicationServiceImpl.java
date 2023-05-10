package com.pack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.ApplicationDao;
import com.pack.pojo.Application;

@Service
public class ApplicationServiceImpl implements ApplicationService 
{
	@Autowired
	private ApplicationDao applicationDao;
	
	
	@Override
	public String add(Application application) 
	{
		String status="";
		try 
		{
			boolean existsById = applicationDao.existsById(application.getId());
			if(existsById == true)
			{
				status="Already Existed successfully";
			}
			else
			{
				Application.isNew = true;
				Application app = applicationDao.save(application);
				if(app == null)
				{
					status="Failure";
				}
				else
				{
					status="sucessfully New One is Added";
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
	public Application search(int id) 
	{
		Application application = null;
		
		try 
		{
			Optional<Application> findById = applicationDao.findById(id);
			if(findById.isPresent()==true)
			{
				application = findById.get();
			}
			else
			{
				application = null;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return application;
	}

	@Override
	public String update(Application application) 
	{
		String status="";
		try 
		{
			boolean existsById = applicationDao.existsById(application.getId());
			if(existsById == false)
			{
				status="Application Not Existed";
			}
			else
			{
				Application.isNew=false;
				Application app = applicationDao.save(application);
				if(app == null)
				{
					status="Sorry Not Updated";
					status = "Successfully Updated";
				}
				else
				{
					status = "Successfully Updated";
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
	public String delete(int id) 
	{
		String status="";
		try 
		{
			Optional<Application> findById = applicationDao.findById(id);
			if(findById.isEmpty()== true)
			{
				status="Not There Application To Delete";
			}
			else
			{
				applicationDao.deleteById(id);
				status="Successfully Deleted";
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Application> getAllApplications() 
	{
		List<Application> listAll = new ArrayList<>();
		applicationDao.findAll().forEach(applications -> listAll.add(applications));
		return listAll;
	}

}
