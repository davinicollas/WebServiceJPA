package com.example.webServiceJPA.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webServiceJPA.enity.User;
/*Interface extendo o jpaRepository usando para criar os crud de determinada classe*/


public interface UserRepository extends JpaRepository<User, Long> {

}
