package com.pack.service;

import com.pack.beans.Movie;

public class MovieServiceImpl implements MovieService 
{

	@Override
	public void playMovie(Movie movie) throws Exception 
	{
		System.out.println("Enter Movie Details");
		System.out.println("=====================");
		System.out.println("Movie name  :"+movie.getName());
		System.out.println("Movie Cost  :"+movie.getCost());
		System.out.println("Movie time  :"+movie.getTime());
		throw new RuntimeException("Power Failure");

	}

}
