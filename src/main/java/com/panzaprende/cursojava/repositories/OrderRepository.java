package com.panzaprende.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panzaprende.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
