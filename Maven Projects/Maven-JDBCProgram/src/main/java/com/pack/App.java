package com.pack;

import com.pack.jdbc.JdbcApp;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	
        JdbcApp jdbc = new JdbcApp();
        jdbc.getEmployee();
    }
}
