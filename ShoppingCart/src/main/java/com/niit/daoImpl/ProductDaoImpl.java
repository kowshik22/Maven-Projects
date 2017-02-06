package com.niit.daoImpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDao;
import com.niit.model.Product;




@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	

		@Autowired
		private SessionFactory sessionFactory;

		
		public ProductDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;	
			System.out.println("inside session constructor");
			//sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}

		@Transactional
		public Product get(String id) {

		
			String hql = "from Product where id='" + id + "'";
			Session session = sessionFactory.getCurrentSession();		
			Query query = session.createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Product> listProduct = (List<Product>) query.list();
			if (listProduct != null && !listProduct.isEmpty()) {			
				return listProduct.get(0);
			}
			return null;
		}

		@Transactional
		public Product getByName(String name) {

			String hql = "from Product where name='" + name + "'";
			
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			
			@SuppressWarnings("unchecked")
			List<Product> listProduct = (List<Product>) query.list();

			if (listProduct != null && !listProduct.isEmpty()) {
			
				return listProduct.get(0);
			}

			return null;
		}
		
		@Transactional
		public boolean saveOrUpdate(Product Product) {
			
			try {
				System.out.println("inside save or update");
				Session session = sessionFactory.getCurrentSession();
				session.saveOrUpdate(Product); 
				session.flush();
						
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
				return false;
			}
		}


		@Transactional
		public boolean delete(String id) {
			try {
				Product ProductToDelete = new Product();
				ProductToDelete.setId(id);
				Session session = sessionFactory.getCurrentSession();
				session.delete(ProductToDelete);
				session.flush();
				
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
				return false;
			}
		}

		
		@Transactional
		public List<Product> list() {

			
			String hql = "from Product ORDER BY ID ASC";
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			List<Product> list = query.list();
			if (list == null || list.isEmpty()) {
			System.out.println("list is empty");
			}
			
			return list;
		}

}
