package com.panzaprende.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panzaprende.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
