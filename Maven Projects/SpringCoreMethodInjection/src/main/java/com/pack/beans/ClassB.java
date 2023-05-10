package com.pack.beans;

import com.pack.Interface.ClassA;

public class ClassB implements ClassA {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("serach");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

}
