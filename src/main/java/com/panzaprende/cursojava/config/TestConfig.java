package com.panzaprende.cursojava.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.panzaprende.cursojava.entities.Person;
import com.panzaprende.cursojava.repositories.PersonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		Person u1 = new Person(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Person u2 = new Person(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		personRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
