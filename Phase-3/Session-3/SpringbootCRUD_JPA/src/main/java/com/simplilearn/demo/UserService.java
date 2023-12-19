package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//method to save user
	public User addUser(User u) {
		return repo.save(u);
	}
	//method to get user
	
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
	//method to get user by id
	public User getUserById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
	}
	//method to delete user
	
	
	
	//method to update user by id

}
