package com.niit.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;



@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	

		@Autowired
		private SessionFactory sessionFactory;

		
		public CategoryDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;	
			System.out.println("inside session constructor");
			//sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}

		@Transactional
		public Category get(String id) {

		
			String hql = "from Category where id='" + id + "'";
			Session session = sessionFactory.getCurrentSession();		
			Query query = session.createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Category> listCategory = (List<Category>) query.list();
			if (listCategory != null && !listCategory.isEmpty()) {			
				return listCategory.get(0);
			}
			return null;
		}

		@Transactional
		public Category getByName(String name) {

			String hql = "from Category where name='" + name + "'";
			System.out.println(hql);
			
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			
			@SuppressWarnings("unchecked")
			List<Category> listCategory = (List<Category>) query.list();

			if (listCategory != null && !listCategory.isEmpty()) {
			
				return listCategory.get(0);
			}

			return null;
		}
		
		@Transactional
		public boolean saveOrUpdate(Category category) {
			
			try {
				System.out.println("inside save or update");
				Session session = sessionFactory.getCurrentSession();
				session.saveOrUpdate(category); 
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
				Category categoryToDelete = new Category();
				categoryToDelete.setId(id);
				Session session = sessionFactory.getCurrentSession();
				session.delete(categoryToDelete);
				session.flush();
				
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
				return false;
			}
		}

		
		@Transactional
		public List<Category> list() {

			
			String hql = "from Category ORDER BY ID ASC";
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			List<Category> list = query.list();
			if (list == null || list.isEmpty()) {
			System.out.println("list is empty");
			}
			
			return list;
		}

}
