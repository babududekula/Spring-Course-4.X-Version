package com.pack.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeInterceptor extends HandlerInterceptorAdapter 
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception 
	{
		long startTime = System.currentTimeMillis();
		request.setAttribute("StartTime", startTime);
		System.out.println("StartTime :"+startTime);
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView)
			throws Exception 
	{
		long startTime = (long) request.getAttribute("StartTime");
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		modelAndView.addObject("StartTime", startTime);
		modelAndView.addObject("EndTime", endTime);
		modelAndView.addObject("TotalTime", totalTime);

	}

}
