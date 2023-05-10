package com.pack.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import com.pack.beans.Employee;

public class Test 
{
	public static void main(String[] args) throws Exception 
	{
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] prop_Drescriptor = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor p:prop_Drescriptor)
		{
			System.out.println("property Name :"+p.getName());
			System.out.println("property Type :"+ p.getPropertyType());
			System.out.println("property Read :"+p.getReadMethod());
			System.out.println("property Write:"+p.getWriteMethod());
			System.out.println("=====================================");
		}
		MethodDescriptor[] method_Drescptor = beanInfo.getMethodDescriptors();
		for(MethodDescriptor m:method_Drescptor)
		{
			System.out.println(m);
			System.out.println("Method Name  :"+m.getName());

		}
		
	}
}
