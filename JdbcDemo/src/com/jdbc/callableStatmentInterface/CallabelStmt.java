package com.jdbc.callableStatmentInterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallabelStmt {
	public static void main(String[] args) {
		System.out.println("jdbc connection");
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kamal","123");
		System.out.println("Connection don");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
