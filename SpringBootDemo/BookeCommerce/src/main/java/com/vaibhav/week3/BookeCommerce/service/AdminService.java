package com.vaibhav.week3.BookeCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.week3.BookeCommerce.entity.Books;
import com.vaibhav.week3.BookeCommerce.repository.BooksRepository;
import com.vaibhav.week3.BookeCommerce.repository.UserRepository;
@Service
public class AdminService {

	    @Autowired
		private UserRepository userRepository;
	    @Autowired
	    private BooksRepository bookRepository;


	public List<Books> saveBooks(List<Books> books) {
	        return bookRepository.saveAll(books);
	    
	}


	public Books saveBook(Books book) {
		return bookRepository.save(book);
	}


	public Books getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}


	public Books getBookByName(String name) {
		return bookRepository.findByName(name).orElse(null);
	}


	public List<Books> getBookByCategory(String category) {
		return bookRepository.findByCategory(category);
	}


	public String deleteBook(Long id) {
		bookRepository.deleteById(null);
        return "book removed !! " + id;

	}


	public String deleteUser(Long id) {
		userRepository.deleteById(id);
        return "User removed !! " + id;
	}

}
