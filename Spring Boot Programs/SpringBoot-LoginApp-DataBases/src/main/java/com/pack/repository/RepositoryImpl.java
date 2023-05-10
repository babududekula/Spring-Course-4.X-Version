package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.pojo.Login;

public interface RepositoryImpl extends JpaRepository<Login, Integer> 
{

	Login findByName(String uname);
	
}
