package com.vaibhav.week3.BookeCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.week3.BookeCommerce.entity.User;
import com.vaibhav.week3.BookeCommerce.entity.Books;
import com.vaibhav.week3.BookeCommerce.service.UserService;

@RestController
public class UserController {
	@Autowired
    private UserService userService;
	
	@GetMapping("/user")
	 public User saveUser(@RequestBody User user) 
	 {
	        return userService.saveUser(user);
	 }
	 
	@GetMapping("/user/updateDetails/{uid}/{Currentpassword}")
	    public String updateUser(@PathVariable("uid") Long uid,@PathVariable("Currentpassword") String Currentpassword, @RequestBody User user) {
	        return userService.updateUser(uid,Currentpassword,user);
	    }
	@GetMapping("/user/updatePassword/{uid}/{Currentpassword}/{Newpassword}")
	    public String updatePassword(@PathVariable("uid") Long uid,@PathVariable("Currentpassword") String Currentpassword,@PathVariable("Newpassword") String Newpassword, @RequestBody User user) {
	        return userService.updatePassword(uid,Currentpassword,Newpassword,user);
	    }
	 @GetMapping("/user/getByCategory/{category}")
	    public List<Books> fetchDepartmentByCategory(@PathVariable("category") String category) {
	        return userService.findByCategory(category);
	    }
	 @GetMapping("/user/buy/{uid}/{bid}")
	    public String buy(@PathVariable("uid") Long uid,@PathVariable("bid") Long bid) {
	        return userService.buyBook(uid,bid);
	    }

	 
}
