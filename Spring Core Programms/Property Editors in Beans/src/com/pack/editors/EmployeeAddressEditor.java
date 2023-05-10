package com.pack.editors;

import java.beans.PropertyEditorSupport;

import com.pack.beans.EmployeeAddress;

public class EmployeeAddressEditor extends PropertyEditorSupport 
{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] str = text.split("-");
		EmployeeAddress eaddr = new EmployeeAddress();
		eaddr.setHno(str[0]);
		eaddr.setState(str[1]);
		eaddr.setCountry(str[2]);
		
		super.setValue(eaddr);
	}
}
