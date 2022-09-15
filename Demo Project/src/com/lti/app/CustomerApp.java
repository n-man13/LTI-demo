package com.lti.app;

import com.lti.service.CustomerService;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService cust = new CustomerService();
		int[] ids = {101,102,103,104,105};
		String[] names = {"Jim", "Bob", "Lou", "Pam", "Sid"};
		String[] addresses = {"192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.4", "192.168.1.5"};
		
		
		
		cust.createCustomer(ids, names, addresses);
		cust.listCustomer();
		cust.updateCustomer(1, 112, "Sam", "192.168.2.2");
		cust.deleteCustomer(4);
		cust.listCustomer();
	}

}
