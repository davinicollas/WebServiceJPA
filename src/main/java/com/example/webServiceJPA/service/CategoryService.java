package com.example.webServiceJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webServiceJPA.enity.Category;
import com.example.webServiceJPA.respositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
 
}
