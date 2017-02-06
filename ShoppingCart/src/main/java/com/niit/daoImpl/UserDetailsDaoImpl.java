package com.niit.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.dao.UserDetailsDao;
//import com.niit.model.Cart;
import com.niit.model.User;
import com.niit.model.UserDetails;
import com.niit.model.UserRole;

@Repository("userDetailsDao")
public class UserDetailsDaoImpl implements UserDetailsDao{


    @Autowired
    private SessionFactory sessionFactory;

	


    @Transactional
	public void addUser(UserDetails userDetails) {
    	System.out.println(userDetails.getFirstName());
        Session session = sessionFactory.openSession();
        
        session.saveOrUpdate(userDetails);
       
        User newUser = new User();
        newUser.setUsername(userDetails.getUsername());
        newUser.setPassword(userDetails.getPassword());
        newUser.setEnabled(true);
        newUser.setUserId(userDetails.getUserId());

        UserRole newUserRole = new UserRole();
        newUserRole.setUsername(userDetails.getUsername());
        newUserRole.setRole("ROLE_ADMIN");
        
        session.save(newUser);
        session.saveOrUpdate(newUserRole);
        session.saveOrUpdate(userDetails);
       
        session.flush();
    }

    
   //LOOK HERE
    @Transactional
    public boolean isValidUser(String name)
    {
    	//select * from UserDetails where id='101' and password='niit'
    	String hql="from UserDetails where username='"+name+"'";
    	Query query=sessionFactory.openSession().createQuery(hql);
    	
    	List<UserDetails> list = query.list();//list of users detail
    	
    	if(list!=null){
        	return false;//invalid user    		
    	}
    	else{
    		return true;//valid user
    	}
    }
   

    @Transactional
    public List<UserDetails> getAllUsers() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UserDetails");
        List<UserDetails> usersDetail = query.list();

        return usersDetail;
    }
    
    @Transactional
    public UserDetails getUserByUsername (String username) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UserDetails where username = ?");
        query.setString(0, username);
        return (UserDetails) query.uniqueResult();
    }


	public UserDetails getUserById(String userId) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.openSession();
	        return (UserDetails) session.get(UserDetails.class, userId);
	   
	}
}
