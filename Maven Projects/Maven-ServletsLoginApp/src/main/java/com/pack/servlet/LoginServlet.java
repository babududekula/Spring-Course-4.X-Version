package com.pack.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
    public LoginServlet() 
    {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		RequestDispatcher dispathcher = null;
		if(name.equalsIgnoreCase("babu") && upwd.equalsIgnoreCase("babu"))
		{
			dispathcher = request.getRequestDispatcher("success.html");
			dispathcher.forward(request, response);
		}
		else
		{
			dispathcher = request.getRequestDispatcher("failure.html");
			dispathcher.forward(request, response);
		}
	}

}
