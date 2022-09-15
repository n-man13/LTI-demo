package com.lti.service;

import com.lti.bean.Customer;

public class CustomerService {
	private Customer[] myCustomers;

	/*
	 * public void createCustomer() { myCustomers = new Customer[5]; for(int i = 0;
	 * i < myCustomers.length; i++) { myCustomers[i] = new Customer(); }
	 * System.out.println("Customer is created."); }
	 */
	public void createCustomer(int[] ids, String[] names, String[] addresses) {
		myCustomers = new Customer[5];
		for (int i = 0; i < myCustomers.length; i++) {
			myCustomers[i] = new Customer();
			myCustomers[i].setCustID(ids[i]);
			myCustomers[i].setName(names[i]);
			myCustomers[i].setAddress(addresses[i]);
		}
		System.out.println("5 Customers are created.");
	}

	public void updateCustomer(int index, int custID, String name, String address) {
		myCustomers[index].setCustID(custID);
		myCustomers[index].setName(name);
		myCustomers[index].setAddress(address);
		
		System.out.println("Customer at " + index + " is updated.");
	}

	public void deleteCustomer(int index) {
		myCustomers[index]=new Customer();
		System.out.println("Customer at " + index + " is deleted.");
	}

	public void listCustomer() {
		System.out.println("Customer is listed.");
		for (int i = 0; i < myCustomers.length; i++) {
			System.out.println("The id of " + i + " Customer ID is :" + myCustomers[i].getCustID() + " and name is : "
					+ myCustomers[i].getName() + "" + myCustomers[i].getAddress());
		}
	}
}
