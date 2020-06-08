package com.flipcard.bean.service;
import com.flipcard.bean.Customer;

public class CustOperation {
	Customer[] custArray = new Customer[100];
	int size = 0;
	
	
	// Add Customer
		public Customer addCustomer(Customer cust) {
//			cust= "customer created"
			System.out.println("Adding Customer" + cust);
			custArray[size] = cust;
			size++;
			return cust;
		}
		
		public void printAllCustomer() {
			for(int i=0; i<size; i++) {
				printCustomer(custArray[i]);
			}
		}
		
		//printCustomer
		public void printCustomer(Customer cust) {
			System.out.println("printing customer");
			if(cust == null) {
				System.out.println("no customer");
				System.out.println("");
				return;
			}
			System.out.println(cust.getCustId());
			System.out.println(cust.getCustName());
			System.out.println(cust.getCustAddress());
			System.out.println(cust.getLocation());
			System.out.println("");
			return;
		}
		
		// Delete Customer
		public Customer deleteCustomer(int custId) {
			for(int i=0; i<size;i++) {
				if(custArray[custId] != null && custArray[custId].getCustId() == custId) {
					custArray[custId] = null;
					System.out.println("deleted customer with Id " + custId);
					System.out.println("");
					return null;
				}
			}
			System.out.println("no customer with given Id");
			System.out.println("");
			return null;
		}
	// edit customer
			
	public Customer editCustomer(Customer cust, int custId) {
		
		for(int i=0; i<size;i++) {
			if(custArray[custId] != null && custArray[custId].getCustId() == custId) {
				custArray[custId] = cust;
				System.out.println("customer edited on details " + custId);
				
				String custEdit="edited customer";
				System.out.println("");
				
				return cust;
			}
		}
		System.out.println("no customer with given Id " + custId);
		System.out.println("");
		return null;
	}
	
	// update customer
	
		public Customer updateCustomer(Customer cust, int custId) {
			for(int i=0; i<size;i++) {
				if(custArray[custId] != null && custArray[custId].getCustId() == custId) {
					custArray[custId] = cust;
					System.out.println("customer updated on details");
					String custUddate= "edited customer";
					System.out.println("");
					return cust;
				}
			}
			System.out.println("no customer with given Id");
			System.out.println("");
			
			return null;
		}
}
