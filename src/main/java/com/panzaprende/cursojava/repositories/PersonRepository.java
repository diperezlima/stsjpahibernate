package com.panzaprende.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panzaprende.cursojava.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	

}
