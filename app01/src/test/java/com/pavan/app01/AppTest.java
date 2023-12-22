package com.pavan.app01;

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
//    	System.out.println("WELCOME TO MAVEN-ECLIPSE JUNIT TESTCASE");
    	Employee emp = new Employee("E-111","PAVAN",1000000,"HYD");
    	emp.getEmpDetails();
        assertTrue( true );
    }
}
