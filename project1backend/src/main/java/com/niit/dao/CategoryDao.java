package com.niit.dao;

import java.util.List;

import com.niit.models.Category;

public interface CategoryDao 
{
	
		public boolean addCategory(Category category);
		public boolean deleteCategory(Category category);
		public boolean updateCategory(Category category);
		public List <Category>getAllCategories();
		public Category getCategory(int CategoryId);

	
	}


	

	
	

