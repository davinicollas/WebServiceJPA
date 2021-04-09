package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
