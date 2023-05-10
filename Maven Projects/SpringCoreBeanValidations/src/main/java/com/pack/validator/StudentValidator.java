package com.pack.validator;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.pack.beans.Student;

public class StudentValidator implements Validator 
{
	private Resource resource;
	
	public void setResource(Resource resource) 
	{
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> object) 
	{
		return Student.class.equals(object);
	}

	@Override
	public void validate(Object obj, Errors errors) 
	{
		try 
		{
			System.out.println("Hello Validator....");
			Properties properties = PropertiesLoaderUtils.loadProperties(resource);
			Student student = (Student)obj;
			if(student.getId()==null || student.getId()=="")
			{
				errors.rejectValue("id", "error.id.empty", properties.getProperty("error.id.empty"));
			}
			else
			{
				if(!student.getId().startsWith("Number-"))
				{
					errors.rejectValue("id", "error.id.invalid", properties.getProperty("error.id.invalid"));
				}
			}
			if(student.getName()==null || student.getName()=="")
			{
				errors.rejectValue("id", "error.name.empty", properties.getProperty("error.name.empty"));
			}
			if(student.getAge() < 18)
			{
				errors.rejectValue("age", "error.age.minage", properties.getProperty("error.age.minage"));
			}
			else if(student.getAge() > 30)
			{
				errors.rejectValue("age", "error.age.maxage", properties.getProperty("error.age.maxage"));
			}
			if(student.getMail()==null || student.getMail()=="")
			{
				errors.rejectValue("mail", "error.mail.empty", properties.getProperty("error.mail.empty"));
			}
			else if(!student.getMail().endsWith("@gmail.com"))
			{
				errors.rejectValue("mail","error.mail.contain",properties.getProperty("error.mail.contain"));
			}
			if(student.getMobile()== null || student.getMobile()=="")
			{
				errors.rejectValue("mobile", "error.mobile.empty", properties.getProperty("error.mobile.empty"));
			}
			else if(!student.getMobile().startsWith("+91-"))
			{
				errors.rejectValue("mobile", "error.mobile.contain", properties.getProperty("error.mobile.contain"));
			}
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
