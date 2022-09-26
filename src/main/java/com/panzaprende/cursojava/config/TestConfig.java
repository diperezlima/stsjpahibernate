package com.panzaprende.cursojava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.panzaprende.cursojava.entities.Category;
import com.panzaprende.cursojava.entities.Order;
import com.panzaprende.cursojava.entities.Person;
import com.panzaprende.cursojava.entities.enums.OrderStatus;
import com.panzaprende.cursojava.repositories.CategoryRepository;
import com.panzaprende.cursojava.repositories.OrderRepository;
import com.panzaprende.cursojava.repositories.PersonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		Person u1 = new Person(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Person u2 = new Person(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		personRepository.saveAll(Arrays.asList(u1, u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
	}

}
