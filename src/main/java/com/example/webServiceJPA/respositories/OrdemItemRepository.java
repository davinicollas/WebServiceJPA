package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.OrderItem;


public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

}
