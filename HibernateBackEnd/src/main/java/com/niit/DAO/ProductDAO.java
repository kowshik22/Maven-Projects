package com.niit.DAO;

import java.util.List;

import com.niit.Model.Product;

public interface ProductDAO {
	
	public List<Product> list();
	
	public Product get(String id);

	public boolean save(Product product);
	
	public boolean update(Product product);

}
