package com.pavan.app02_Jdbc;
import com.pavan.jdbc.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Through main" );
    	JdbcApp jdbcApp = new JdbcApp();
    	jdbcApp.getEmpDetails();
    }
}
