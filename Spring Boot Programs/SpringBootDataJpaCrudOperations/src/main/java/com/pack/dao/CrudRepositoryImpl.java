package com.pack.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Employee;

public interface CrudRepositoryImpl extends JpaRepository<Employee, Serializable>
{
	
}
