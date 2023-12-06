package com.simplilearn.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoImpl implements UserDAO{

	@Override
	public int createUser(User User) {
		// TODO Auto-generated method stub
		int result=0;
		Connection conn=DBConfig.getConnection();
		if(conn!=null) {
			 
			try {
				String query="insert into student(name,email,username) value(?,?,?)";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setString(1,User.getName());
				stmt.setString(2,User.getEmail());
				stmt.setString(3,User.getUsername());
				
				result=stmt.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else {
			System.out.println("Error While Connecting");
		}
		
		return result;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
