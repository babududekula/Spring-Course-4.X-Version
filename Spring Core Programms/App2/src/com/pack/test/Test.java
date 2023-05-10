package com.pack.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pack.beans.EmpBean;

public class Test 
{

	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("/com/pack/resource/ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmpBean hello = (EmpBean)factory.getBean("empbean");
		hello.getEmp();
			
			
	}

}
