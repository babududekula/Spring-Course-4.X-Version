package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.LoginDao;
import com.pack.model.Login;

@Service
public class LoginServiceImpl implements LoginService 
{
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Login ByName(String uname) 
	{
		Login login= null;
		try 
		{
			login  = loginDao.findByName(uname);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return login;
	}

}
