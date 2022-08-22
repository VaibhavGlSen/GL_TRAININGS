package com.vaibhav.week3.BookeCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaibhav.week3.BookeCommerce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	
}
