package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	
	@Id
	private int supplierid;
	private String suppliername;
	private String supplierdesc;
	
	public int getSupplierid() {
		return supplierid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSupplierdesc() {
		return supplierdesc;
	}

	public void setSupplierdesc(String supplierdesc) {
		this.supplierdesc = supplierdesc;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	
	
	

}
