package com.niit.DAOImplExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import com.niit.DAOExample.UserDAO;
import com.niit.model.Supplier;
import com.niit.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class UserDAOIMPL implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOIMPL() {

	}

	public UserDAOIMPL(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listuser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listuser;
	}

	@Transactional
	public User get(String UserId) {
		String hql = "from User where userId=" + UserId;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}

	@Transactional
	public User validate(String UserId, String Password) {
		String hql = "from user where Userd ='" + UserId + "'and password='" + Password + "'";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return (User) query.uniqueResult();
	}

	@Transactional
	public boolean save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return false;
	}

	@Transactional
	public boolean update(User user) {
		sessionFactory.getCurrentSession().update(user);
		return false;
	}

}