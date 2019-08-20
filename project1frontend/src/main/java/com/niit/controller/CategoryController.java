 package com.niit.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CategoryDao;
import com.niit.models.Category;

@Controller
public class CategoryController
{

	@Autowired
	CategoryDao categoryDao;

	@RequestMapping("/admin/getCategoryform")
	
	
	public String showCategory(Model m)
	{
		List<Category> getAllCategories=categoryDao.getAllCategories();
		
		m.addAttribute("catList", getAllCategories);
		
		return "Category";
	}
	@RequestMapping(value="/InsertCategory",method=RequestMethod.POST)
	
	public String saveCategoryDetail(@RequestParam("catName")String CategoryName,@RequestParam("catDesc") String CategoryDesc,Model m)
	{
		Category category=new Category();
		category.setCategoryname(CategoryName);
		category.setCategoryDesc(CategoryDesc);
		categoryDao.addCategory(category);
		
		List<Category> getAllCategories=categoryDao.getAllCategories();
		m.addAttribute("catList", getAllCategories);
		
		return "Category";
	}
	
	@RequestMapping(value="/deleteCategory/{CategoryId}")
	public String deleteCategory(@PathVariable("CategoryId")int CategoryId,Model m)
	{
		Category category=categoryDao.getCategory(CategoryId);
		categoryDao.deleteCategory(category);
		
		List<Category> getAllCategories=categoryDao.getAllCategories();
		m.addAttribute("catList", getAllCategories);
		
		return "Category";
	}
	
	@RequestMapping(value="/editCategory/{CategoryId}")
	public String editCategory(@PathVariable("CategoryId")int CategoryId,Model m)
	{
		Category category=categoryDao.getCategory(CategoryId);
         categoryDao.updateCategory(category);
		
		List<Category> getAllCategories=categoryDao.getAllCategories();
		m.addAttribute("catList", getAllCategories);
		
				return "UpdateCategory";
	}
	
	@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
	 public String UpdateCategory(Model m,@RequestParam("catId")int CategoryId,@RequestParam("catName")String categoryName,@RequestParam("catDesc")String categoryDesc)
	 {
		 Category category=categoryDao.getCategory(CategoryId);
		 category.setCategoryname(categoryName);
		 category.setCategoryDesc(categoryDesc);
		 categoryDao.updateCategory(category);
		 List<Category> getAllCategories=categoryDao.getAllCategories();
		 m.addAttribute("categorydata",getAllCategories);
		 return "Category";
	 }

	
}