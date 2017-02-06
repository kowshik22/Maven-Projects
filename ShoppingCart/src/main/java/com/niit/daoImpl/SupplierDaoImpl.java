package com.niit.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDao;

import com.niit.model.Supplier;

@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	

	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}
	
	public SupplierDaoImpl( ) {
	
	}
	
	
	@javax.transaction.Transactional
	public Supplier getByName(String name) {


		String hql = "from Supplier where name='" + name + "'";
System.out.println(hql);
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();

		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}

		return null;
	}
	@javax.transaction.Transactional
	public boolean save(Supplier supplier) {
		// TODO Auto-generated method stub

		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@javax.transaction.Transactional
	public boolean saveOrUpdate(Supplier supplier) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(supplier); 
			session.flush();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@javax.transaction.Transactional
	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			sessionFactory.getCurrentSession().flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@javax.transaction.Transactional
	public boolean delete(String id) {
		try {
			Supplier supplierToDelete = new Supplier();
			supplierToDelete.setId(id);
			Session session = sessionFactory.getCurrentSession();
			session.delete(supplierToDelete);
			session.flush();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@javax.transaction.Transactional
	public Supplier get(String id) {


		String hql = "from Supplier where id='" + id + "'";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();

		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}

		return null;
	}

	@javax.transaction.Transactional
	public List<Supplier> list() {

		String hql = "from Supplier ORDER BY ID ASC";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();
		if (list == null || list.isEmpty()) {
			System.out.println("No products available");
		}
		return list;
	}
}
