package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@RequestMapping("/api/user")
public class MainController {
	
	@Autowired
	private UserService service;
	
	//create method to insert a record
	//localhost:8082/api/user/-----> post method
	@PostMapping("/")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User user=service.addUser(u);
		if(user!=null)
			return new ResponseEntity<User>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<User>(user,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//get all record of user
	//localhost:8082/api/user/--->get Method
	@GetMapping("/")
	public List<User> getAllUser(){
		return service.getAllUser();
	}
	
	//get user by its id
	//localhost:8082/api/user/1----->get user by id
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id){
		User user=service.getUserById(id);
		
		if(user!=null)
			return new ResponseEntity<User>(user,HttpStatus.FOUND);
		else
			return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
	}
	
	//delete the user by id;
	//localhost:8082/api/user/1-------> delete method
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable int id){
		if(service.deleteUser(id))
			return new ResponseEntity<Object>("User Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Found", HttpStatus.NOT_FOUND);
	}
	
	//update user by id
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody User user,@PathVariable int id){
		User data=service.updateUser(user, id);
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User Not Found",HttpStatus.NOT_FOUND);
	}

}
