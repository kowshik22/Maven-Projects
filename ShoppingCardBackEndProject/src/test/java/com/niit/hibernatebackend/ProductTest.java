package com.niit.hibernatebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAOExample.CategoryDAO;
import com.niit.DAOExample.ProductDAO;
import com.niit.model.Category;
import com.niit.model.Product;

public class ProductTest {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Product product=(Product)ctx.getBean("product");
		ProductDAO productdao=(ProductDAO)ctx.getBean("productDAO");
	product.setProductId("123");
		product.setProductName("abd");
		product.setProductPrice(2500);
		
		productdao.save(product);

		
	}

}

