package com.books.microservice.booksservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class CircuteBreakerTestController {
	/*
	 * private Logger log =
	 * LoggerFactory.getLogger(CircuteBreakerTestController.class);
	 * 
	 * @GetMapping("sample-test") //@Retry(name="default", fallbackMethod =
	 * "customFallBackResponse")
	 * 
	 * @CircuitBreaker(name="default", fallbackMethod = "customFallBackResponse")
	 * 
	 * @Bulkhead(name="default", fallbackMethod = "customFallBackResponse")
	 * //@RateLimiter(name="default", fallbackMethod = "customFallBackResponse")
	 * public String getTest() {
	 * log.info("test logger info @@@@@@@@@@@@@@@@@@@@@@@  -> {}", "test call");
	 * String a = new RestTemplate().getForObject("http://localhost:9000",
	 * String.class); return a; }
	 * 
	 * public String customFallBackResponse(Exception ex) { return
	 * "still service not up"; }
	 */}
