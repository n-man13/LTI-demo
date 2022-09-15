package com.lti.app;

import com.lti.service.CustomerService;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService cust = new CustomerService();

		cust.createCustomer();
		cust.listCustomer();
		cust.updateCustomer();
		cust.deleteCustomer();
	}

}
