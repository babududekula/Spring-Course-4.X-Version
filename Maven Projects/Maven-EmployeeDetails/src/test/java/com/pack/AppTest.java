package com.pack;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

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
    	Employee emp = new Employee("Dudekula Babu", "1523", 65490, "Hyd");
    	emp.getEmployeeDetails();
        assertTrue( true );
    }
}
