package com.Mike.Proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mike.Proj.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	
	

}
