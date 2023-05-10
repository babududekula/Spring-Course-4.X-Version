package com.pack.controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.pack.command.Student;
import com.pack.exception.MarksOutOfBoundsException;
@org.springframework.stereotype.Controller
public class Controller 
{
	
	@RequestMapping(value = "/hellopage" , method = RequestMethod.GET)
	public ModelAndView studentFrom()
	{
		ModelAndView mav = new ModelAndView("studentform" , "student" ,new Student());
		return mav;
	}
	
	@RequestMapping(value = "/reg" , method = RequestMethod.POST)
	public ModelAndView Register(Student student)
	{
		if(student.getSmarks() < 0 || student.getSmarks() > 100)
		{
			throw new MarksOutOfBoundsException("Please Provide Marks Between 0 To 100 Only....");
		}
		ModelAndView mav = new ModelAndView("studentregistrationform", "name",student);
		return mav;
	}
}
