package com.vaibhav.Week2Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.Week2Project.repository.MerchantRepository;
import com.vaibhav.Week2Project.repository.ProductRepository;

@Service
public class MerchantService {
	@Autowired
    private MerchantRepository repository;
}
