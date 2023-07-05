package com.problem.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {
	
	public static void main(String[]args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databasename","root","root");
		
		Statement sd=con.createStatement();
		
		ResultSet rs=sd.executeQuery("select * from emp");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+""+rs.getInt(0));
		con.close();
		
		}catch(Exception e){ System.out.println(e);}
		
		
		
		
		
		
	}

}
