package com.pack.validators;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pack.beans.Employee;

public class EmployeeValidator implements Validator 
{
	private Resource resource;
	
	public void setResource(Resource resource) 
	{
		this.resource = resource;
	}

	@Override
	public boolean supports(Class type) 
	{
		System.out.println("Hello");
		return Employee.class.equals(type);
	}

	@Override
	public void validate(Object obj, Errors errors) 
	{
		try 
		{
			System.out.println("Hello....Validate()");
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
			Employee emp = (Employee) obj;
			
			if(emp.getEid() == null || emp.getEid() == "")
			{
				errors.rejectValue("eid", "error.eid.empty", prop.getProperty("error.eid.empty"));
			}
			else
			{
				if(!emp.getEid().startsWith("C-"))
				{
					errors.rejectValue("eid", "error.eid.invalid",prop.getProperty("error.eid.invalid"));
				}
			}
			if(emp.getEname() == null || emp.getEname() == "")
			{
				errors.rejectValue("ename", "error.ename.empty", prop.getProperty("error.ename.empty"));
			}
			else
			{
				if(!emp.getEname().startsWith("Dudekula"))
				{
					errors.rejectValue("ename", "error.ename.invalid",prop.getProperty("error.ename.invalid"));
				}
			}
			
			if(emp.getEage() < 18)
			{
				errors.rejectValue("eage","error.eage.minage", prop.getProperty("error.eage.minage"));
			}
			else 
				if(emp.getEage() > 45)
			{
				errors.rejectValue("eage", "error.eage.maxage", prop.getProperty("error.eage.maxage"));
			}
			if(emp.getEsal() <= 50000.0)
			{
				errors.rejectValue("esal", "error.esal.invalid", prop.getProperty("error.esal.invalid"));
			}
			
			if(emp.getEemail() == null || emp.getEemail() == "")
			{
				errors.rejectValue("eemail", "error.eemail.empty", prop.getProperty("error.eemail.empty"));
			}
			else 
			{ 
				if(!emp.getEemail().endsWith("@gmail.com"))
				{
					errors.rejectValue("eemail", "error.eemail.invalid",prop.getProperty("error.eemail.invalid"));
				}
			}
			if(emp.getEmobile() == null || emp.getEmobile() == "")
			{
				errors.rejectValue("emobile", "error.emobile.empty", prop.getProperty("error.emobile.empty"));
			}
			else
			{
				if(!emp.getEmobile().startsWith("+91-"))
				{
					errors.rejectValue("emobile", "error.emobile.invalid",prop.getProperty("error.emobile.invalid"));
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}













