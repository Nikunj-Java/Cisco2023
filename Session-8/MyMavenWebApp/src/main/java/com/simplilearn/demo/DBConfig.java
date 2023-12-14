package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	
	public static Connection getConnections() {
		Connection connection=null;
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco1";
		String username="root";
		String password="Nikunj@123";
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
