package com.niit.HibernateBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.Model.Category;

public class CategoryTest {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.niit.*");
		con.refresh();
		Category category=(Category)con.getBean("category");
		CategoryDAO categorydao=(CategoryDAO)con.getBean("CategoryDAO");
	
	    category.setCategory_id(01);
	    category.setCategory_name("abc");
		category.setCategory_desc("bnn");
		categorydao.save(category);	
		
	}
}