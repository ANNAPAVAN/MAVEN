package com.pavan.app02_Jdbc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pavan.jdbc.JdbcApp;

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
    	System.out.println( "Through test" );
     	JdbcApp jdbcApp = new JdbcApp();
     	jdbcApp.getEmpDetails();
        assertTrue( true );
    }
}
