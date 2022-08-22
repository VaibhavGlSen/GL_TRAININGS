package com.vaibhav.Week2Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.Week2Project.entity.Merchants;

public interface MerchantRepository extends JpaRepository<Merchants, Integer>{

}
