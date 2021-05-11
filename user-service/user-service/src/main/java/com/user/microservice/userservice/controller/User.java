package com.user.microservice.userservice.controller;

import org.springframework.stereotype.Component;

@Component
public class User {
   private Integer id;
   private String name;
   private Books books;
   
   public User() {}
	public User(Integer id, String name, Books books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	
	
   
   
}
