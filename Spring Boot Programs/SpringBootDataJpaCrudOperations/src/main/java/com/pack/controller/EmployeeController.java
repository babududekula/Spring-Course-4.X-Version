package com.pack.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.daoimpl.EmployeeDaoImpl;
import com.pack.entity.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeDaoImpl service;
	
	@PostMapping("/hello")
	public ResponseEntity<String> createAccount(@RequestBody Employee emp)
	{
		String name = service.upset(emp);
		return new ResponseEntity<>(name,HttpStatus.CREATED);
	}
	@GetMapping("/hello1/{id}")
	public ResponseEntity<Employee> serachAccount(int id)
	{
		Employee search = service.search(id);
		return new ResponseEntity<>(search,HttpStatus.OK);
	}
	
	@GetMapping("/hello2")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> allEmployees = service.getAllEmployees();
		return new ResponseEntity<>(allEmployees,HttpStatus.OK);
	}
	
	@PutMapping("/hello3")
	public ResponseEntity<String> updateAccount(@RequestBody Employee employee)
	{
		String status = service.upset(employee);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/hello4/{id}")
	public ResponseEntity<String> deleteAccount(int id)
	{
		String delete = service.delete(id);
		return new ResponseEntity<>(delete,HttpStatus.OK);
	}
}
