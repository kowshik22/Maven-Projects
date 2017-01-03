package com.niit.hibernatebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAOExample.UserDAO;
import com.niit.model.User;

public class UserTest {
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	AnnotationConfigApplicationContext ctx;
	
	public UserTest()
	{
		ctx= new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		
		userDAO = (UserDAO)ctx.getBean("userDAO");
		user = (User)ctx.getBean("user");
	}
	public boolean validate(String id,String password) {
		if(userDAO.validate(id, password)==null) {
			System.out.println("user does't exit");
			return false;
		}
		else {
			System.out.println("user get credential");
			return true;
		} 	
			
		}
		public static void main(String[] args) {
			UserTest t=new UserTest();
			t.validate("niit","niit");
		}
	
}