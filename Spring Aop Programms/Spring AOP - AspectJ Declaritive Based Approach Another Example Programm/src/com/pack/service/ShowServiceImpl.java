package com.pack.service;
import com.pack.beans.Show;

public class ShowServiceImpl implements ShowService 
{

	@Override
	public String runShow(Show show) throws RuntimeException 
	{
		System.out.println("**** show "+show.getName()+" started ****");
		System.out.println("**** show "+show.getName()+" Running successfully ****");
		if(!show.getName().equalsIgnoreCase("mimicry"))
		{
			throw new RuntimeException();
		}
		System.out.println("**** show "+show.getName()+" End ****");
		return "success";
	}

}
