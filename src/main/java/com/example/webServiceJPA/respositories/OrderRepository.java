package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
