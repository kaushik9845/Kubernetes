package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	CustomerRepository custRep;
	
	@GetMapping("/findAll")
	public Iterable<Customer> index() {
		return custRep.findAll();
		
	}
}
