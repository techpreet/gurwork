package com.gur.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
*
* @author Gurpreet
*
*/
public class GetConnection {

	public static Connection getMysql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gurpreetdb", "root", "Gurpreet@007");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return null; 
		
	}
	
	public static void main(String[] args) {
		System.out.println(getMysql());
	}
	
}

