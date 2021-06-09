package com.danielsilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielsilveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
