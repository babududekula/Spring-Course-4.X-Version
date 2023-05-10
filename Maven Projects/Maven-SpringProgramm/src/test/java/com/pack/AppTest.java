package com.pack;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pack.test.Client;

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

        Client test = new Client();
        test.checkCredentials();
        assertTrue( true );
    }
}
