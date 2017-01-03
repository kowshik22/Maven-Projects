package com.niit.DAOExample;
import com.niit.model.Supplier;

import java.util.List;
public interface SupplierDAO {
	public List<Supplier> list();
	public Supplier get(String supplierId);
	public boolean save(Supplier sup);
	public boolean update(Supplier sup);
	}
