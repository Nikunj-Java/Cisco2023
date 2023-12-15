package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.dao.EProductDAO;
import com.simplilearn.entity.EProductEntity;

@Controller
public class MainController {
	
	@Autowired
	EProductDAO dao;
	
	@GetMapping("/listproducts")
	public String getAllProducts(Model map) {
		
		List<EProductEntity> list=dao.getAllProducts();
		map.addAttribute("list",list);
		return "products";
	}

}
