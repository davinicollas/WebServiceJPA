package com.example.webServiceJPA.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webServiceJPA.enity.Products;
import com.example.webServiceJPA.service.ProductsService;

@RestController
@RequestMapping(value = "/products")
public class ProductsResouce {
	@Autowired	
	private ProductsService productService;
	
	@GetMapping
	public ResponseEntity<List<Products>> findAll() {
		List<Products> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Products> findById(@PathVariable Long id){
		Products obj =  productService.findById(id);
		return ResponseEntity.ok().body(obj);

	}
}
