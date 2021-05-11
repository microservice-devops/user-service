package com.user.microservice.userservice.controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@Autowired
	private User user;
	@Autowired
	Environment env;
	@Autowired
	private UserProxy userProxy;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/users")
	public User getUsers() {

		user.setId(12);
		user.setName("upendra");
		/*
		 * ResponseEntity<? extends Books> response = new
		 * RestTemplate().getForEntity("http://localhost:8100/books", new
		 * Books().getClass()); user.setBooks(response.getBody());
		 */
		user.setBooks(userProxy.getBooks());
		return user;
	}

	@GetMapping("/lbusers")
	public User getUsers1() {

		user.setId(12);
		user.setName("upendra");
		Books books =   restTemplate.getForObject("http://BOOKS-SERVICE/books", new Books().getClass());
		
		/*
		 * Books response = new restTemplate.getForEntity("http://localhost:8100/books",
		 * new Books().getClass());
		 */
		user.setBooks(books);
		 
		user.setBooks(userProxy.getBooks());
		return user;
	}

	/*
	 * public void setUserData(User user) { user.setId(12); user.setName("upendra");
	 * //user.setBooks(new Books("redhat", "linux os",
	 * env.getProperty("local.server.port")));
	 * 
	 * }
	 */
}
