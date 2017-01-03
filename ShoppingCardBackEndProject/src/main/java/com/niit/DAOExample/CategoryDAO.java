package com.niit.DAOExample;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {
public List<Category> list();
public Category get(String categoryId);
public boolean save(Category cat);
public boolean update(Category cat);
}
