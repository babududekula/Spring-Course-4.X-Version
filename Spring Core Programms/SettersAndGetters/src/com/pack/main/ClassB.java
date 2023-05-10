package com.pack.main;

import java.util.Scanner;

import com.pack.bean.ClassA;

public class ClassB 
{
	 void method()
	 {
		 Scanner sc = new Scanner(System.in);
		 ClassA obj = new ClassA();
		 System.out.println("Enter your name : ");
		 String sname = sc.nextLine();
		 obj.setName(sname);
		 
		 System.out.println("Enter your number : " );
		 int snumber = sc.nextInt();
		 obj.setNumber(snumber);
		 
		 System.out.println("Enter your salary : ");
		 float ssalary = sc.nextFloat();
		 obj.setSalary(ssalary);
		 
		 System.out.println(obj.getName());
		 System.out.println(obj.getNumber());
		 System.out.println(obj.getSalary());
	 }
	
	public static void main(String[] args) 
	{
		ClassB obj1 = new ClassB();
		obj1.method();

	}

}
