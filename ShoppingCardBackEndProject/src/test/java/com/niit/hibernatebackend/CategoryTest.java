package com.niit.hibernatebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAOExample.CategoryDAO;
import com.niit.model.Category;

public class CategoryTest {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Category category=(Category)ctx.getBean("category");
		CategoryDAO categoriesdao=(CategoryDAO)ctx.getBean("CategoryDAO");
	
	    category.setCatagoryId("c1");
	    category.setCatagoryName("abc");
		
		categoriesdao.save(category);	
		
		
	}

}
