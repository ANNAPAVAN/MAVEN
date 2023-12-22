package com.pavan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcApp {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	
	public JdbcApp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Mysql134");
			st = con.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getEmpDetails()
	{
		try {
			rs = st.executeQuery("select * from employee");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getFloat("esal")+"\t");
				System.out.print(rs.getString("eaddr")+"\t");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
