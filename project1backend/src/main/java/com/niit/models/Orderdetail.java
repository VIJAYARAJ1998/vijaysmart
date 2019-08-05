package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Orderdetail 
{
	 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int orderID;
		public int getOrderID() {
			return orderID;
		}
		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}
		public String getUserName() {
			return UserName;
		}
		public void setUserName(String userName) {
			UserName = userName;
		}
		public int getTotalShoppingAmount() {
			return TotalShoppingAmount;
		}
		public void setTotalShoppingAmount(int totalShoppingAmount) {
			TotalShoppingAmount = totalShoppingAmount;
		}
		public String getPmode() {
			return Pmode;
		}
		public void setPmode(String pmode) {
			Pmode = pmode;
		}
		String UserName;
		int TotalShoppingAmount;
		String Pmode;
		
		

	}


