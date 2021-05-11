package com.user.microservice.userservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//@FeignClient(name="books-service", url = "http://localhost:8100") == with out eureka server
@FeignClient(name="books-service")
public interface UserProxy {

	
	@GetMapping("/books")
	public Books getBooks() ;
}
