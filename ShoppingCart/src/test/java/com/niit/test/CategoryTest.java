/*package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;


public class CategoryTest {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.niit.*");
		con.refresh();
		Category category=(Category)con.getBean("category");
		CategoryDao categorydao=(CategoryDao)con.getBean("categoryDao");
	
	    category.setId("123");
	    category.setName("kowshik");
		category.setDescription("nothing");
		categorydao.saveOrUpdate(category);	
		
	}
}
*/