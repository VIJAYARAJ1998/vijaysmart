package com.niit.dao;

import com.niit.models.Orderdetail;

public interface OrderDAO 
{
	public boolean Payment(Orderdetail orderdetail);
	public boolean UpdateCartItemStatus(String UserName);

}
