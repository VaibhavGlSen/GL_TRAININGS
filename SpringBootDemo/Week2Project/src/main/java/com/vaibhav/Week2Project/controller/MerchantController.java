package com.vaibhav.Week2Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.Week2Project.service.MerchantService;
import com.vaibhav.Week2Project.service.ProductService;

@RestController
@RequestMapping("/Merchant")
public class MerchantController {

	@Autowired
    private MerchantService service;
}
