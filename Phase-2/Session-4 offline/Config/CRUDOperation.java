package com.simplilearn.demo;

import java.sql.Connection;

public class CRUDOperation {
	public static void main(String[] args) {
		Connection conn=DBConfig.getConnection();
		
		if(conn!=null)
			System.out.println("Connection Established");
		else
			System.out.println("Error in COnnection");
		
	}

}
