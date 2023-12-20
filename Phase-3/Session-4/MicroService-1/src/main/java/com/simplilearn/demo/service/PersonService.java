package com.simplilearn.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.demo.entity.PersonEntity;
import com.simplilearn.demo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;
	
	private RestTemplate restTemplate=new RestTemplate();
	
	
	public PersonEntity addPerson(PersonEntity person) {
		return repo.save(person);
	}
	
	public PersonResponse getPerson(int personId) {
		
		final String url="http://localhost:8082/api/hobby/{personId}";
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("personId", personId);
		String hobby=restTemplate.getForObject(url, String.class,map);
		
		PersonEntity entity=repo.getById(personId);
		PersonResponse resp=new PersonResponse();
		resp.setPersonId(entity.getPersonId());
		resp.setName(entity.getName());
		resp.setEmail(entity.getEmail());
		resp.setPassword(entity.getPassword());
		resp.setAge(entity.getAge());
		resp.setHobby(hobby);
		
		return resp;
	}
	

}
