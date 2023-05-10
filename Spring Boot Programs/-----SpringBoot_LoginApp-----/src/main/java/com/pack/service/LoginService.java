package com.pack.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.LoginDao;
import com.pack.entity.Login;


@Service
public class LoginService implements LoginServiceDao
{
	@Autowired
	private LoginDao loginDao;

	@Override
	public Login ById(Login login) 
	{
		Login login2 = null;
		String l = login.getUpwd();
		Optional<Login> login1 = loginDao.findById(login.getUname());
		if(l.equals(login1.get().getUpwd()))
		{
			login2 = login1.get();
		}
		else
		{
			login2 = null;
		}
		return login2;
	}
}
