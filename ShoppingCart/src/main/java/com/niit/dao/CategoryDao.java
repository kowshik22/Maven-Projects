package com.niit.dao;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDao {
	
	public Category get(String id);

	public Category getByName(String name);

	public boolean saveOrUpdate(Category category);

	public boolean delete(String id);

	public List<Category> list();
}
