package com.pack.h1;

public class ClassA 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(this.meth2()+56);
	}
	int meth2()
	{
		System.out.println(75);
		System.out.println(96);
		return this.meth3();
	}
	int meth3()
	{
		System.out.println(74);
		System.out.println(92);
		return 74-92;
	}
	public void meth4()
	{
		System.out.println(56);
	}
	ClassA()
	{
		this(52);
		this.meth1();
		System.out.println(85);
	}
	public ClassA(int a)
	{
		System.out.println(a+7);
	}
	
}
