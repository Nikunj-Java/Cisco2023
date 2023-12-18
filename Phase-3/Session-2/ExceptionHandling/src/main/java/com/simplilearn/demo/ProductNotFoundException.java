package com.simplilearn.demo;

public class ProductNotFoundException  extends Exception{

	public ProductNotFoundException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ProductNotFound [Not FOund with ID 0]";
	}
	
	
}
