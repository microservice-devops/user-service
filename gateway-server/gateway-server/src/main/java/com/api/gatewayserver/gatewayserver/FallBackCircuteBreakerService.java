package com.api.gatewayserver.gatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FallBackCircuteBreakerService {

	
	@GetMapping("/userFallbackResponse")
	public String userFallbackResponse() {
		return "user is not responding right now, call later";
	}
	
	@GetMapping("/booksFallbackResponse")
	public String booksFallbackResponse() {
		return "books is not responding right now, call later";
	}
}
