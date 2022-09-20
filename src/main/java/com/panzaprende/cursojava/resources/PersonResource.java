package com.panzaprende.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panzaprende.cursojava.entities.Person;

@RestController
@RequestMapping(value = "/users")
public class PersonResource {
	
	@GetMapping
	public ResponseEntity<Person> findAll() {
		Person user = new Person(1L, "Diego", "diego@gmail.com", "3123323", "1234");
		return ResponseEntity.ok().body(user);
	}

}
