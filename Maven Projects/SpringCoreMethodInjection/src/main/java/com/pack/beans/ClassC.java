package com.pack.beans;

import com.pack.Interface.ClassA;

public class ClassC implements ClassA {

	@Override
	public void add() {
		System.out.println("AddClass");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("SerachClass");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("UpdateClass");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("DeleteClass");
	}

}
