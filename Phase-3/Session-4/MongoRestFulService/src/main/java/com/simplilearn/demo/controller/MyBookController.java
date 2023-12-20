package com.simplilearn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.MyBook;
import com.simplilearn.demo.service.MyBookService;

@RestController
@RequestMapping("/api/books")
public class MyBookController {
	
	@Autowired
	private MyBookService service;
	
	@PostMapping("/add")
	public MyBook addBook(@RequestBody MyBook book) {
		return service.addBook(book);
	}
	
	
	

}
