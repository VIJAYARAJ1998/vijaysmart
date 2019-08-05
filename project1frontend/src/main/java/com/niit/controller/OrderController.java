package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
public class OrderController 
{
	@Autowired
	@RequestMapping(value="/payment/")
	public String showpaymentpage() {
		return "Payment";
	}
	@RequestMapping(value="/orderdetails/")
	public String showorderdetailspage() {
		return "orderDetails";
	}
}
