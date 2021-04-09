package com.example.webServiceJPA.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webServiceJPA.enity.User;
import com.example.webServiceJPA.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	@Autowired	
	private UserService userservice;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj =  userservice.findById(id);
		return ResponseEntity.ok().body(obj);

	}
}
