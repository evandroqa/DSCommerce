package com.devsuperior.dscommerce.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscommerce.entities.Category;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping
	public String teste() {
		List<Category> category = new ArrayList<>();
		return "Olá mundo";
	}
	

}
