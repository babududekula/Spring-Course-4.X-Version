package com.pack.beans;

public class CarService 
{
	private Engine engine;

	public CarService() 
	{
		System.out.println("This is Default Constructor...");
	}
	 public CarService(Engine engine) 
	 {
		 System.out.println("This is Parametrized Constructor...");
		this.engine=engine;
	 }
	 
	 public void setEngine(Engine engine)
	 {
		 System.out.println("This is Setter Depency Injection");
		 this.engine=engine;
	 }
	 
	 public void service()
	 {
		 int i = engine.fuel();
		 if(i == 2)
		 {
			 System.out.println("Car Started With petrol");
		 }
		 else
		 {
			 System.out.println("Car Started With Diesel");
		 }
	 }
	
	
}