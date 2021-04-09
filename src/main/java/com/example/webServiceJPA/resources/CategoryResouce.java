package com.example.webServiceJPA.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webServiceJPA.enity.Category;
import com.example.webServiceJPA.service.CategoryService;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResouce {
	@Autowired	
	private CategoryService Categoryservice;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = Categoryservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj =  Categoryservice.findById(id);
		return ResponseEntity.ok().body(obj);

	}
}
