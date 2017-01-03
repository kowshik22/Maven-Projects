package com.niit.hibernatebackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAOExample.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierTest {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		
		Supplier supplier = (Supplier)ctx.getBean("supplier");
		SupplierDAO supplierDAO = (SupplierDAO)ctx.getBean("supplier");
		
		supplier.setSupplierId("S1");
		supplier.setSupplierName("Abc");
		supplier.setSupplierAddress("supplierAddress");
		
		supplierDAO.save(supplier);
	}
}

