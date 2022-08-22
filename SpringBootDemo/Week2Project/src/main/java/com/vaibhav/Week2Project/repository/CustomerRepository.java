package com.vaibhav.Week2Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.Week2Project.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
