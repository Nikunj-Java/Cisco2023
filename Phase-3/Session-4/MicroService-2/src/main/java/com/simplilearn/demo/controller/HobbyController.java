package com.simplilearn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.HobbyEntity;
import com.simplilearn.demo.service.HobbyService;

@RestController
@RequestMapping("/api/hobby")
public class HobbyController {
	
	@Autowired
	private HobbyService service;
	
	@PostMapping("/")
	public ResponseEntity<HobbyEntity> addHobby(@RequestBody HobbyEntity hobby){
		HobbyEntity obj=service.addHobby(hobby);
		return new ResponseEntity<HobbyEntity>(obj,HttpStatus.CREATED);
	}
	
	@GetMapping("/{personId}")
	public String getHobbyByPId(@PathVariable int personId) {
		return service.findByPersonId(personId);
	}

}
