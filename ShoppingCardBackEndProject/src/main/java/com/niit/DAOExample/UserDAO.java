package com.niit.DAOExample;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	public List<User> list();
	public User get(String userId);
	public User validate(String userId,String password);
	public boolean save(User user);
	public boolean update(User user);
	}
