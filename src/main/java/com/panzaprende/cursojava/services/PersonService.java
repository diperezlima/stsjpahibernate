package com.panzaprende.cursojava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panzaprende.cursojava.entities.Person;
import com.panzaprende.cursojava.repositories.PersonRepository;


@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public List<Person> findAll() {
		return repository.findAll();
	}
	
	public Person findById(Long id) {
		Optional<Person> obj = repository.findById(id);
		return obj.get();
	}

}