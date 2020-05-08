package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	
	@GetMapping(value = "/")
	public void home() {
		
	}
	
	
	
}
