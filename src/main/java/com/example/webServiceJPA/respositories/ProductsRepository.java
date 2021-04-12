package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.Category;
import com.example.webServiceJPA.enity.Products;


public interface ProductsRepository extends JpaRepository<Products, Long> {

}
