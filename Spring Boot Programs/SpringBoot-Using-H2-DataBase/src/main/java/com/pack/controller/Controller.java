package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.pojo.Application;
import com.pack.service.ApplicationService;

@RestController
public class Controller 
{
	@Autowired
	private ApplicationService applicationService;
	
	@PostMapping("/add")
	private String addMethod(@RequestBody Application application)
	{
		String status = applicationService.add(application);
		return status;
	}
	
	@GetMapping("/search/{id}")
	private String searchMethod(@PathVariable("id") int id)
	{
		String status="";
		Application app = applicationService.search(id);
		if(app == null)
		{
			status="Not Existed";
		}
		else
		{
			status="Application Searched Successfully";
		}
		return status;
	}
	
	@PostMapping("/update")
	private String updateMethod(@RequestBody Application application)
	{
		String status = applicationService.update(application);
		return status;
	}
	
	@DeleteMapping("/delete/{id}")
	private String deleteMethod(@PathVariable("id") int id)
	{
		String status = applicationService.delete(id);
		return status;
	}
	
	@GetMapping("/all")
	private List<Application> getAllApplications()
	{
		List<Application> listAll = applicationService.getAllApplications();
		return listAll ;
	}
}
