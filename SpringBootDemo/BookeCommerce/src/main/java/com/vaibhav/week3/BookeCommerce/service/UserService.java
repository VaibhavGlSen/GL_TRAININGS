package com.vaibhav.week3.BookeCommerce.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.week3.BookeCommerce.entity.Books;
import com.vaibhav.week3.BookeCommerce.entity.User;
import com.vaibhav.week3.BookeCommerce.repository.BooksRepository;
import com.vaibhav.week3.BookeCommerce.repository.UserRepository;

@Service
public class UserService {
    @Autowired
	private UserRepository userRepository;
    @Autowired
    private BooksRepository bookRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public String updateUser(Long uid,String currentpassword, User user) {
		User userDB = userRepository.findById(uid).get();

        if(currentpassword.equals(userDB.getPassword())==true && Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName())) {
            userDB.setName(user.getName());
        }

        if(currentpassword.equals(userDB.getPassword())==true && Objects.nonNull(user.getEmail())&& !"".equalsIgnoreCase(user.getEmail()) ) {
                    userDB.setEmail(user.getEmail());
                }
        
        userRepository.save(userDB);
        return "update successfull";
	}

	public String updatePassword(Long uid, String currentpassword, String newpassword, User user) {
		User userDB = userRepository.findById(uid).get();
       if(currentpassword.equals(userDB.getPassword())==true &&Objects.nonNull(user.getName()) &&  !"".equalsIgnoreCase(user.getName()) )
       {
    	   userDB.setPassword(newpassword);
       }
	   String nameString=user.getName();
       userRepository.save(userDB);

	   return "password updated for "+ nameString;
	}


	public List<Books> findByCategory(String category) {
		return bookRepository.findByCategory(category);
	}

	public String buyBook(Long uid, Long bid) {
		User userDB = userRepository.findById(uid).get();
		Books bookDB = bookRepository.findById(bid).get();
		bookDB.setStudent(userDB);
		return "order successfull";
	}
}
