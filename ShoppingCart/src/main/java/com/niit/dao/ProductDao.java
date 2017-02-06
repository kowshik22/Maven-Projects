package com.niit.dao;

import java.util.List;


import com.niit.model.Product;



public interface ProductDao {
	
	public Product get(String id);

	public Product getByName(String name);

	public boolean saveOrUpdate(Product product);

	public boolean delete(String id);

	public List<Product> list();}
