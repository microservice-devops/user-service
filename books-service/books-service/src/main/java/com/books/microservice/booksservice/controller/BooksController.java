package com.books.microservice.booksservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {
 
	@Autowired
	private Books books;
	
	@Autowired
	Environment env;
	
	@GetMapping("/books")
	public Books getBooks() {
		 
		books = new Books("redhat", "linux os", env.getProperty("local.server.port"));
		return books;
	}
	
}
