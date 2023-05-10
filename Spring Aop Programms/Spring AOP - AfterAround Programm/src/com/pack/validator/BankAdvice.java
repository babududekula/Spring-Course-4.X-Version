package com.pack.validator;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


import com.pack.beans.Account;
import com.pack.beans.Cheque;

public class BankAdvice implements MethodInterceptor 
{
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable 
	{
		Object[] params = mi.getArguments();
		Account account = (Account) params[0];
		Cheque cheque = (Cheque) params[1];
		
		System.out.println("Hello "+account.getAccName()+ "!, cheque No "+cheque.getCheque_no()+" is coming For Clearence amount is "+cheque.getAmount()+" is comig to withdraw ");
		mi.proceed();
		System.out.println("Hello "+account.getAccName()+ "!, cheque No "+cheque.getCheque_no()+" is Clear , Now Available Amount is "+account.getBalance()+" available");
		
		return null;
	}

}
