package com.pack.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.pojo.Application;

public interface ApplicationDao extends CrudRepository<Application, Integer> 
{

}
