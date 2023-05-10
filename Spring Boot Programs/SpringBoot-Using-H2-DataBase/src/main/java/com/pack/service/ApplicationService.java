package com.pack.service;

import java.util.List;

import com.pack.pojo.Application;

public interface ApplicationService 
{
	public String add(Application application);
	public Application search(int id);
	public String update(Application application);
	public String delete(int id);
	public List<Application> getAllApplications();
}
