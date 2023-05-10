package com.pack.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.pojo.Mobile;

public interface MobileDao extends CrudRepository<Mobile, String> 
{
	
}
