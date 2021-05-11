package com.limits.service.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceController {

	@Autowired
	private TestLimits limits;
	
	@GetMapping("/limits")
	private TestLimits getLimts() {
		return limits;
	}
}
