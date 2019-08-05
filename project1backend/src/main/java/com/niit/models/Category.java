 package com.niit.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int CategoryId;   
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	
	public String getCategoryDesc() {
		return CategoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		CategoryDesc = categoryDesc;
	}
	@OneToMany(mappedBy="category")
    private List<Product>products; 
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public String getCategoryname() {
		return Categoryname;
	}
	public void setCategoryname(String categoryname) {
		Categoryname = categoryname;
	}
	String Categoryname;
	String CategoryDesc;	

}
