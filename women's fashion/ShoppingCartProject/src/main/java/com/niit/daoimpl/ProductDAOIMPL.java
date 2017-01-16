package com.niit.daoimpl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;


@Repository("productDAO")
public class ProductDAOIMPL implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	//At the time of creation of instance, you have to pass sessionFactory
	
	public ProductDAOIMPL(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		System.out.println(sessionFactory);
	}
@org.springframework.transaction.annotation.Transactional
	public List<Product> list() {
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        session.flush();
		return productList;
	}
@org.springframework.transaction.annotation.Transactional
	public Product get(String id) {
		return (Product)sessionFactory.getCurrentSession().get(Product.class, id);
	}
	@Transactional
	public boolean save(Product product) {
		try{
			sessionFactory.getCurrentSession().save(product);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;

}
@org.springframework.transaction.annotation.Transactional
	public boolean update(Product product) {
		try{
			sessionFactory.getCurrentSession().update(product);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
}


}