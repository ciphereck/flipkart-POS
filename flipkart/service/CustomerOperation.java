/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Customer;

/**
 * @author rahul
 *
 */
public class CustomerOperation {
	//Add Customer
	public Customer addCustomer(Customer cust) {
//		cust = "Customer is created";
		System.out.println("Customer created " + cust.getCustID() + " " + cust.getCustName()+ " " +cust.getCustAddress());
		
		return cust;
	}
	
	//Delete Customer
	public int deleteCustomer(int custID) {
		System.out.println("Customer is deleted with id" + custID);
		return custID;
	}
	
	//List customer
	public String listCustomer(String cust) {
		cust = "Customer is edited";
		return cust;
	}
	
	//Update the customer
	public String updateCustomer(String cust) {
		cust = "Customer is updated";
		return cust;
	}

}
