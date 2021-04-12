package com.example.webServiceJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webServiceJPA.enity.Products;
import com.example.webServiceJPA.respositories.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	private ProductsRepository repository;

	public List<Products> findAll(){
		return repository.findAll();
	}
	public Products findById(long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
 
}
