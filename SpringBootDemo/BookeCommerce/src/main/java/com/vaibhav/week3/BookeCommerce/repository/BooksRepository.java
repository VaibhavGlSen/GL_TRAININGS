package com.vaibhav.week3.BookeCommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.week3.BookeCommerce.entity.Books;

public interface BooksRepository extends JpaRepository<Books,Long>{

	public List<Books> findByCategory(String category);

	public Optional<Books> findByBid(int bid);


	public Optional<Books> findByName(String name);
}
