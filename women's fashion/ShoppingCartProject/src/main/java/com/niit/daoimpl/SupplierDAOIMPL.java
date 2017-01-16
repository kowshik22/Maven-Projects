package com.niit.daoimpl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;


@Repository("supplierDAO")
public class SupplierDAOIMPL implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//At the time of creation of instance, you have to pass sessionFactory
	
	public SupplierDAOIMPL(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		System.out.println(sessionFactory);
	}

@Transactional
	public List<Supplier> list() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Supplier> supplierList = query.list();
        session.flush();

        return supplierList;
	}
@Transactional
	public Supplier get(String id) {
		return (Supplier)sessionFactory.getCurrentSession().get(Supplier.class, id);
	}
@org.springframework.transaction.annotation.Transactional
	public boolean save(Supplier supplier) {
		try{
			sessionFactory.getCurrentSession().save(supplier);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
@Transactional
	public boolean update(Supplier supplier) {
		try{
			sessionFactory.getCurrentSession().update(supplier);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}



}