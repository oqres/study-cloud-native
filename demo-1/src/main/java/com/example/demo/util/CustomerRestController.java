package com.example.demo.util;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	private final CustomerService customerService;
	public CustomerRestController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public Collection<Customer> findAll(){
		return this.customerService.findAll();
	}
	
	
	@GetMapping("/hello")
	public String hello(){
		return "HELLO GIT";
	}
	
	
	
	
	
	

}
