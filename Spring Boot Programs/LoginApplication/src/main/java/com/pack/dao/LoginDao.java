package com.pack.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.model.Login;


public interface LoginDao extends CrudRepository<Login, Integer>
{
	public Login findByName(String uname);
}
