package com.pack.beans;

public class CurrentAccount implements Account {

	@Override
	public void create() {
		System.out.println("Current account create");
		
	}

	@Override
	public void serach() {
		
		System.out.println("Current account search");
	}

	@Override
	public void update() {
		
		System.out.println("Current account update");
	}

	@Override
	public void delete() {
		System.out.println("Current account delete");
		
	}

}
