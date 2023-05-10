package com.pack.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pack.command.Employee;

public class ValidatorImpl implements Validator 
{
	
	@Override
	public boolean supports(Class<?> cls) 
	{
		return Employee.class.isAssignableFrom(cls);		
		
	}

	@Override
	public void validate(Object command, Errors errors) 
	{	
		ValidationUtils.rejectIfEmpty(errors, "ename", "ename.required");
		ValidationUtils.rejectIfEmpty(errors, "epwd", "epwd.required");
		ValidationUtils.rejectIfEmpty(errors, "eage", "eage.required");
		ValidationUtils.rejectIfEmpty(errors, "eemail", "eemail.required");
		ValidationUtils.rejectIfEmpty(errors, "emobile", "emobile.required");
		
		Employee emp = (Employee) command;
		int i = Integer.parseInt(emp.getEage());
		
		
		if(!emp.getEpwd().equals("")&& emp.getEpwd().length() < 6)
		{
			errors.rejectValue("epwd", "epwd.minLength");
		}
		if(!emp.getEpwd().equals("") && emp.getEpwd().length() > 10)
		{
			errors.rejectValue("epwd", "epwd.maxLength");
		}
		if(!emp.getEemail().equals("") && !emp.getEemail().endsWith("@gmail.com"))
		{
			errors.rejectValue("eemail", "eemail.invalid");
		}
		if( i > 18 || i < 30)
		{
			errors.rejectValue("eage", "eage.age");
		}
			
		if(!emp.getEmobile().equals("") && !emp.getEmobile().startsWith("+91-"))
		{
			errors.rejectValue("emobile", "emobile.inavlid");
		}
	}

}
