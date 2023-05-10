package com.pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Login;


public interface LoginDao extends JpaRepository<Login, String> 
{
	
}
