package com.niit.DAOImplExample;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


import com.niit.DAOExample.CategoryDAO;
import com.niit.model.Category;

@SuppressWarnings("deprecation")
@Repository
public class CategoryDAOIMPL implements CategoryDAO  {
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOIMPL() {

	}

	public CategoryDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Category> list() {

		@SuppressWarnings("unchecked")
		List<Category> category = (List<Category>) sessionFactory.getCurrentSession()
				.createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return category;
	}

	@Transactional

	public Category get(String catagoryId) {
		String hql = "from Catagories where catagoryId=" + catagoryId;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Category> listCatagories = (List<Category>) query.list();
		if (listCatagories != null && !listCatagories.isEmpty()) {
			return listCatagories.get(0);
		}
		return null;
	}

	@Transactional
	public boolean save(Category cat) {
		sessionFactory.getCurrentSession().save(cat);
		return false;
	}

	@Transactional
	public boolean update(Category cat) {
		sessionFactory.getCurrentSession().update(cat);
		return false;
}


}
