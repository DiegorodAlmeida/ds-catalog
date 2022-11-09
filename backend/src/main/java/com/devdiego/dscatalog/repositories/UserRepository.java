package com.devdiego.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devdiego.dscatalog.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//para buscar no bd um usuario com email como argumento
	User findByEmail(String email);
}
