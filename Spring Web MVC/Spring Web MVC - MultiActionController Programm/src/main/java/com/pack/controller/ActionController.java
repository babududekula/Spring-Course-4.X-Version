package com.pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.pack.beans.StudentDto;
import com.pack.dao.StudentDao;


public class ActionController extends MultiActionController 
{
	
	private StudentDao studentdao;
	String status = null;
	String message ="";
	
	public void setStudentdao(StudentDao studentdao) 
	{
		this.studentdao = studentdao;
	}
	
	public ModelAndView add(HttpServletRequest request , HttpServletResponse response , ModelMap map)
	{
		String s1 = request.getParameter("sid");
		String s2 = request.getParameter("sname");
		float s3 = Float.parseFloat(request.getParameter("ssal"));
		String s4 = request.getParameter("saddr");
		
		StudentDto student = new StudentDto();
		student.setSid(s1);
		student.setSname(s2);
		student.setSsal(s3);
		student.setSaddr(s4);
		
		status = studentdao.add(student);
		
		if(status.equalsIgnoreCase("success"))
		{
			message = "Student Insertion Successfully";
		}
		else if(status.equalsIgnoreCase("Failure"))
		{
			message = "Student Insertion Failure";
		}
		else
		{
			message = "Student Is Already Inserted";
		}
		
		return new ModelAndView("status", "name", message);
	}
	public ModelAndView search(HttpServletRequest request , HttpServletResponse response , ModelMap map)
	{
		String s = request.getParameter("sid");
		
		StudentDto std = new StudentDto();
		std.setSid(s);
		
		ModelAndView mav = null;
		std = studentdao.serach(s);
		if(std == null)
		{
			mav = new ModelAndView("status", "name", "Student Not Existed");
		}
		else
		{
			mav = new ModelAndView("student", "student", std);
		}
		
		return mav;
	}
	public ModelAndView editform(HttpServletRequest request , HttpServletResponse response , ModelMap map)
	{
		String s = request.getParameter("sid");
		
		StudentDto student = new StudentDto();
		student.setSid(s);
		
		student = studentdao.serach(s);
		ModelAndView mav = null;
		if(student == null)
		{
			mav = new ModelAndView("status", "name", "Student Not Existed");
		}
		else
		{
			mav = new ModelAndView("studenteditform" , "student" ,student);
		}
		return mav;
	}
	public ModelAndView update(HttpServletRequest request , HttpServletResponse response , ModelMap map)
	{
		String s1 = request.getParameter("sid");
		String s2 = request.getParameter("sname");
		float s3 = Float.parseFloat(request.getParameter("ssal"));
		String s4 = request.getParameter("saddr");
		
		StudentDto student = new StudentDto();
		student.setSid(s1);
		student.setSname(s2);
		student.setSsal(s3);
		student.setSaddr(s4);
		
		ModelAndView mav = null;
		status = studentdao.update(student);
		if(status.equalsIgnoreCase("success"))
		{
			message = "Student Updated Successfully";
		}
		else if(status.equalsIgnoreCase("failure"))
		{
			message = "Student Updation Failure";
		}
		else
		{
			message = "Student Is Not Existed";
		}
		return new ModelAndView("status", "name", message);
	}
	public ModelAndView delete(HttpServletRequest request , HttpServletResponse response , ModelMap map)
	{
		String s = request.getParameter("sid");
		
		StudentDto std = new StudentDto();
		std.setSid(s);
		
		status =studentdao.delete(s);
		if(status.equalsIgnoreCase("success"))
		{
			message = "Student Delete Successfully";
		}
		else if(status.equalsIgnoreCase("failure"))
		{
			message = "Student Deletion Failure";
		}
		else
		{
			message = "Student Is Not Existed To Delete";
		}
		return new ModelAndView("status", "name", message);
	}
}













