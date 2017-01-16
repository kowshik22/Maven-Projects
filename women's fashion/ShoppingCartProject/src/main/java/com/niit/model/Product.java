package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {
	
	@Id
	private int productid;
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	private String productname;
	private String productdesc;
	
	public int getProductid() {
		return productid;
	}
	
	
	
	

}
