package com.niit.DAOImplExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAOExample.ProductDAO;
import com.niit.model.Product;
import com.niit.model.Product;
@Repository
public class ProductDAOIMPL implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOIMPL() {

	}

	public ProductDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> listproducts = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listproducts;
	}

	@Transactional

	public Product get(String ProductId) {
		String hql = "from Products where productId=" + ProductId;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}

		return null;
	}

	@Transactional

	public boolean save(Product pro) {

		sessionFactory.getCurrentSession().save(pro);

		return false;
	}

	@Transactional

	public boolean update(Product pro) {

		sessionFactory.getCurrentSession().update(pro);
		return false;
	}

}