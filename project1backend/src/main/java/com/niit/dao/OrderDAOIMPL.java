package com.niit.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.models.Orderdetail;

public class OrderDAOIMPL implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean Payment(Orderdetail orderdetail) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(orderdetail);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception"+ e);	
		return false;
	}
	}
	@Override
	public boolean UpdateCartItemStatus(String UserName) 
	{
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("Update Cart");
		
		return false;
	}
	}

