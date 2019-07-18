package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.models.Category;
@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao
{

	@Autowired
	SessionFactory sessionFactory; 
	
	public boolean addCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}


	public boolean deleteCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(category);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	
	public boolean updateCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().update(category);
		return true;	
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Category getCategory(int CategoryId) 
	{
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,CategoryId);
		session.close();
		return category;
	}

	public List<Category>getAllCategories() 
	{
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Category");
		List<Category> getAllCategories=(List<Category>)session.createQuery("from Category").list();
		session.close();
		return getAllCategories;
	}

	
}