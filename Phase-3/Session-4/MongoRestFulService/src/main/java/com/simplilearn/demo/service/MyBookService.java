package com.simplilearn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.MyBook;
import com.simplilearn.demo.repository.MyBookRepository;

@Service
public class MyBookService {

	@Autowired
	private MyBookRepository repo;
	
	//method to save value
	public MyBook addBook(MyBook book) {
		return repo.save(book);
	}
}
