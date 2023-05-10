package com.pack.service;

import java.util.List;

import com.pack.pojo.Mobile;

public interface MobileService 
{
	public String add(Mobile mobile);
	public Mobile search(String mobileName);
	public String update(Mobile mobile);
	public String delete(String mobileName);
	public List<Mobile> getAllEmployees();
}
