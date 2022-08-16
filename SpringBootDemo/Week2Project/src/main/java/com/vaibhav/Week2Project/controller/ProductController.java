package com.vaibhav.Week2Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.vaibhav.Week2Project.entity.Product;
import com.vaibhav.Week2Project.service.ProductService;


@RestController
public class ProductController {

	 @Autowired
	    private ProductService service;

	    @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }
	    @GetMapping("/productByCategory/{category}")
	    public List<Product> findProductByCategory(@PathVariable String category) {
	        return service.getProductByCategory(category);
	    }

	    @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	        return service.updateProduct(product);
	    }
	    @PutMapping("/addCategory")
	    public Product addCategoryProduct(@RequestBody Product product) {
	        return service.addCategoryProduct(product);
	    }
	    @PutMapping("/addMerchant")
	    public Product addMnameProduct(@RequestBody Product product) {
	        return service.addMnameProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
}
