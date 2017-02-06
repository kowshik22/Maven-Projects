/*package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDao;
import com.niit.model.Supplier;


public class SupplierTest {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.niit.*");
		con.refresh();
		Supplier supplier=(Supplier)con.getBean("supplier");
		SupplierDao supplierdao=(SupplierDao)con.getBean("supplierDao");
	
	    supplier.setId("123");
	    supplier.setName("kowshik");
		supplier.setAddress("bangalore");
		supplierdao.saveOrUpdate(supplier);	
		
	}
}
*/