package com.simplilearn.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.MyBook;

@Repository
public interface MyBookRepository extends MongoRepository<MyBook, String> {

	//queries we can write if needed
}
