package com.simplilearn.demo.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.MyBook;
import com.simplilearn.demo.repository.MyBookRepository;
import com.simplilearn.demo.service.MyBookService;

@RestController
@RequestMapping("/api/books")
public class MyBookController {
	
	@Autowired
	private MyBookService service;

 
	
	@PostMapping("/")
	public MyBook addBook(@RequestBody MyBook book) {
		return service.addBook(book);
	}
	
	 
	@GetMapping("/")
	public List<MyBook> getAllBooks(){
		return service.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MyBook> getBookById(@PathVariable String id){
	
		MyBook book=service.getBookById(id);
		if(book!=null)
			return new ResponseEntity<MyBook>(book,HttpStatus.FOUND);
		else
			return new ResponseEntity<MyBook>(book,HttpStatus.NOT_FOUND);
	}
	
	   //delete the user by id;
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Object> deleteUser(@PathVariable String id){
			if(service.deleteBook(id))
				return new ResponseEntity<Object>("User Deleted", HttpStatus.OK);
			else
				return new ResponseEntity<Object>("No User Found", HttpStatus.NOT_FOUND);
		}
		
		//update user by id
		@PutMapping("/{id}")
		public ResponseEntity<Object> updateUser(@RequestBody MyBook book,@PathVariable String id){
			MyBook data=service.updateUser(book, id);
			if(data!=null)
				return new ResponseEntity<Object>(data,HttpStatus.OK);
			else
				return new ResponseEntity<Object>("User Not Found",HttpStatus.NOT_FOUND);
		}
	
	
	
	

}
