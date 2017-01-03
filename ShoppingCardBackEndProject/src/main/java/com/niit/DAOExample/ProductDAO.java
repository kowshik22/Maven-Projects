package com.niit.DAOExample;
import com.niit.model.Product;

import java.util.List;
public interface ProductDAO {
	public List<Product> list();
	public Product get(String productId);
	public boolean save(Product pro);
	public boolean update(Product pro);
	}
