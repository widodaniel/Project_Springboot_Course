package com.danielsilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielsilveira.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
