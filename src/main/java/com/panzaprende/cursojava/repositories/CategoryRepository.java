package com.panzaprende.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panzaprende.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
