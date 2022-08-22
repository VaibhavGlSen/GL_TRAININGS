package com.vaibhav.week3.BookeCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.week3.BookeCommerce.entity.Books;
import com.vaibhav.week3.BookeCommerce.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
    private AdminService adminService;

	@GetMapping("/admin")
	 public Books saveBook(@RequestBody Books book) 
	 {
	        return adminService.saveBook(book);
	 }
	@PostMapping("/admin")
    public List<Books> addBooks(@RequestBody List<Books> books) {
        return adminService.saveBooks(books);
    }
	@GetMapping("/admin/bookById/{id}")
    public Books findBookById(@PathVariable Long id) {
        return adminService.getBookById(id);
    }

    @GetMapping("/admin/bookByName/{name}")
    public Books findProductByName(@PathVariable String name) {
        return adminService.getBookByName(name);
    }
    @GetMapping("/admin/bookaByCategory/{category}")
    public List<Books> findProductByCategory(@PathVariable String category) {
        return adminService.getBookByCategory(category);
    }
    @DeleteMapping("/admin/deleteBook/{id}")
    public String deleteBook(@PathVariable Long id) {
        return adminService.deleteBook(id);
    }
    @DeleteMapping("/admin/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id) {
        return adminService.deleteUser(id);
    }
    
}
