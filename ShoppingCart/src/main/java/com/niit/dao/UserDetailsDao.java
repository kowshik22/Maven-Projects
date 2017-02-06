package com.niit.dao;

import java.util.List;

import com.niit.model.UserDetails;

public interface UserDetailsDao {

	   public void addUser (UserDetails userDetails);

	   public UserDetails getUserById (String userId);

	   public List<UserDetails> getAllUsers();

	    UserDetails getUserByUsername (String username);
	  
	    public boolean isValidUser(String name);
}
