package com.mostafa.spring.service;

import com.mostafa.spring.entities.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}
