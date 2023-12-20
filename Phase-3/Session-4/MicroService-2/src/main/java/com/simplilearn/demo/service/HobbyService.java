package com.simplilearn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.HobbyEntity;
import com.simplilearn.demo.repo.HobbyRepo;

@Service
public class HobbyService {
	
	@Autowired
	private HobbyRepo repo;
	
	public HobbyEntity addHobby(HobbyEntity hobby) {
		return repo.save(hobby);
	}
	public String findByPersonId(int personId) {
		return repo.findByPersonId(personId);
	}
	
	 

}
