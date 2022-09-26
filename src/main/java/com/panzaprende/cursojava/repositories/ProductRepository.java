package com.panzaprende.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panzaprende.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
