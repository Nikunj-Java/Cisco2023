package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

}
