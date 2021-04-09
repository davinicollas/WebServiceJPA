package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
