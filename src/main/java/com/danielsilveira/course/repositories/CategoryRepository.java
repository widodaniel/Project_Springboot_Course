package com.danielsilveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielsilveira.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
