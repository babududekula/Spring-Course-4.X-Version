package com.pack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pack.jdbc.JdbcApp;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	JdbcApp jdbc = new JdbcApp();
    	jdbc.getEmployee();
    	assertTrue( true );
    }
}
