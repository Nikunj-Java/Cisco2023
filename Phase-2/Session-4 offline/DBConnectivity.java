package com.simplilearn.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
	
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco1";
		String username="root";
		String password="Nikunj@123";
		
		
		try {
			//01. load the driver
			Class.forName(driver);
			//02. get  connectivity
			Connection conn=DriverManager.getConnection(url,username,password);
			//03. check the connection
			if(conn!=null) {
				System.out.println("COnnection Established");
			}else {
				System.out.println("Error While Connecting");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
	}

}
