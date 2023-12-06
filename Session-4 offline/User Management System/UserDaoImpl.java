package com.simplilearn.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		Connection conn= DBConfig.getConnection();
		String query= "select * from student";
		try {
			PreparedStatement pst= conn.prepareStatement(query);
			ResultSet rst=pst.executeQuery();
			List<User> list= new ArrayList<>();
			
			while(rst.next()) {
				User u = new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4));
				list.add(u);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

	@Override
	public User updateUser(User user, int id) {
		int result=0;
		Connection conn=DBConfig.getConnection();
		if(conn!=null) {
			 
			try {
				String query="insert into student(name,email,username) value(?,?,?)";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setString(1,user.getName());
				stmt.setString(2,user.getEmail());
				stmt.setString(3,user.getUsername());
				
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
		
		return user;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		boolean res=false;
		Connection conn= DBConfig.getConnection();
		String query= "delete from student where id=?";
		try {
			PreparedStatement stmt= conn.prepareStatement(query);
			stmt.setInt(1, id);
			
			int x= stmt.executeUpdate();
			if(x>0) {
				res=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User user=null;
		ResultSet result=null;
		Connection conn=DBConfig.getConnection();
		if(conn!=null) {
			 
			try {
				String query="select * from student where id=?";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setInt(1, id);			
				result=stmt.executeQuery();
				result.next();
				
				user= new User(result.getInt("id"),result.getString("name"), result.getString("email"), result.getString("username"));
				
				 				
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
		
		return user;
	 
	}

}
