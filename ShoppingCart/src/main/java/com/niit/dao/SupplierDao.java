package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;



public interface SupplierDao {
	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public boolean saveOrUpdate(Supplier supplier);

	public boolean delete(String id);

	public Supplier get(String id);

	public Supplier getByName(String name);

	public List<Supplier> list();

}
