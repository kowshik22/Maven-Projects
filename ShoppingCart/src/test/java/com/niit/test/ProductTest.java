package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.SupplierDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

public class ProductTest {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.niit.*");
		con.refresh();
		Product product=(Product)con.getBean("product");
		ProductDao productdao=(ProductDao)con.getBean("productDao");
		Supplier supplier=(Supplier)con.getBean("supplier");
		SupplierDao supplierdao=(SupplierDao)con.getBean("supplierDao");
		Category category=(Category)con.getBean("category");
		CategoryDao categorydao=(CategoryDao)con.getBean("categoryDao");
		Category category1 = categorydao.getByName(product.getCategory().getName());

	    product.setId("435");
	    product.setName("ramesh");
		product.setDescription("something");
		product.setPrice(1233);
		product.setCategory(category1);
		productdao.saveOrUpdate(product);	
		
	}
}
