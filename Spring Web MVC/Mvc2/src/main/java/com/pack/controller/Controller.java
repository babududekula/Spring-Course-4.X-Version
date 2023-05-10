package com.pack.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.bean.Student;
import com.pack.dao.StudentDao;

public class Controller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
  
    public Controller() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int number = Integer.parseInt(request.getParameter("hno"));
		StudentDao studentDao = new StudentDao();
		Student std = studentDao.getResults(number);
		request.setAttribute("student", std);
		RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}

}
