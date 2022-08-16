package com.vaibhav.Week2Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vaibhav.Week2Project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	List<Product> findByCategory(String category);
	

}
