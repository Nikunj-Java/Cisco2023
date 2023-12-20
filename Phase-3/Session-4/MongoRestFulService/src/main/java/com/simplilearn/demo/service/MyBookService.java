package com.simplilearn.demo.service;

import java.util.List;

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
	
	//method to get Data
	public List<MyBook> getAllBooks(){
		return repo.findAll();
	}
	
	//method to get books by id
	public MyBook getBookById(String id) {
		
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}else {
			return null;
		}
		
	}
	
	//delete the book by id
	
	//update the book by id
	
	 

}
