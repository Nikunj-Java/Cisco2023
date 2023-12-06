package com.simplilearn.management;

import java.util.List;
import java.util.Scanner;

public class UserManagementSystem {
	public static void main(String[] args) {
		
		UserDAO dao= new UserDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PRESS 1 for Create Record \nPRESS 2 for Update Record\nPRESS 3 for Delete Record\nPRESS 4 for Retirve Record\nPRESS 5 for Retrive Record by Id");
		
		int input=sc.nextInt();
		
		switch (input) {
			case 1:
			//create reacord
				System.out.println("**************INSERT RECORD**************");
				sc.nextLine();
				System.out.println("enter your name");
				String name=sc.nextLine();
				
		 
				System.out.println("enter your email");
				String email=sc.nextLine();
				
			 
				System.out.println("enter your username");
				String username=sc.nextLine();
				
				int res=dao.createUser(new User(name, email, username));
				
				if(res>0) {
					System.out.println("User Inserted Successfully");
				}
				else {
					System.out.println("User Not Inserted");
				}
				
			break;
			case 2:
			//update a record
				System.out.println("**************UPDATE RECORD**************");
				
				 
			break;
			
			case 3:
			//delete a record
				System.out.println("**************DELETE RECORD**************");
				
				System.out.println("Enter Id for delete");
				int id= sc.nextInt();
				if(dao.deleteUser(id)) {
					System.out.println("User deleted");
				}else {
					System.out.println("No user avaialble to delete with id "+id);
				}
				
			break;
			
			case 4:
			//retirve a record
				System.out.println("**************FETCH RECORD**************");
				List<User> list= dao.getAllUsers();
				System.out.println(list);
				break;
				
			
			case 5:
			//retrive by id
				System.out.println("**************FETCH RECORD BY ID**************");
				
	
		
		}
		
		 
		
		
	}

}
