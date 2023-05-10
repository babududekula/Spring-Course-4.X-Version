package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.pojo.Mobile;
import com.pack.service.MobileService;

@RestController
public class Controller 
{
	@Autowired
	private MobileService service;
	
	@PostMapping("/add")
	public String addMethod(@RequestBody  Mobile mobile)
	{
		String status = service.add(mobile);
		return status;
	}
	
	@GetMapping("/search/{name}")
	public Mobile searchMethod(@PathVariable("name") String mobileName)
	{
		return service.search(mobileName);
	}
	
	@PutMapping("/update")
	public String updateMethod(@RequestBody Mobile mobile)
	{
		String status = service.update(mobile);
		return status;
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteMethod(@PathVariable("id") String mobileName)
	{
		String status = service.delete(mobileName);
		return status;
	}
	
	@GetMapping("/all")
	public List<Mobile> getAllMobiles()
	{
		List<Mobile> listAll = service.getAllEmployees();
		return listAll;
	}
}
