package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo44jdbc {
	public static void main(String[] args) {
		
		// java to database
		// 5 steps
		// step 1 load the driver + add the jar file
		// step 2 create the connection
		// step 3 create the statement
		// step 4 is to execute teh statement
		// step 5 is to close the connection

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "Rushikesh@97");
	Statement stmt = con.createStatement();
	stmt.execute("insert into emp values(200, 'Rushikesh')");
	stmt.close();
	System.out.println("data inserted sucessfully..!");
} catch (Exception e) {
	System.out.println(e);
}	
	}
}