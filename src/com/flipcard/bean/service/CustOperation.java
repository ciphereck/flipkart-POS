package com.flipcard.bean.service;
import java.util.ArrayList;
import java.util.List;

import com.flipcard.bean.Customer;
import com.flipcard.exception.NotDeliveringAtLocationException;

public class CustOperation implements Operation {
		List<Customer> custArray = new ArrayList<Customer>();
		List<String> notDelivering = new ArrayList<String>();
		
		public CustOperation() {
			notDelivering.add("Delhi");
			notDelivering.add("Jaipur");
		}
	
		@Override
		public Customer addCustomer(Customer cust) throws NotDeliveringAtLocationException {
//			if(cust.getLocation().contains("Delhi")) {
//				throw new NotDeliveringAtLocationException(cust.getLocation());
//			} else if(cust.getLocation().contains("Jaipur")) {
//				throw new NotDeliveringAtLocationException(cust.getLocation());
//			}
			
			if(notDelivering.contains(cust.getLocation())) {
				throw new NotDeliveringAtLocationException(cust.getLocation());
			}
			custArray.add(cust);
			return cust;
		}
		
		@Override
		public void printAllCustomer() {
			if(custArray.size()==0) {
				System.out.println("no customer here. Please add new customers");
			}
			for(int i=0; i<custArray.size(); i++) {
				printCustomer(custArray.get(i));
			}
		}
		
		public void printCustomer(int id) {
			for(int i=0; i<custArray.size(); i++) {
				if(custArray.get(i).getCustId() == id)
					printCustomer(custArray.get(i));
			}
		}
		
		@Override
		public void printCustomer(Customer cust) {
			System.out.println("printing customer");
			if(cust == null) {
				// if customer reference is null
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
		
		public Customer findCustomerById(int custId) {
			for(Customer customer : custArray) {
				if(customer.getCustId() == custId) {
					return customer;
				}
			}
			return null;
		}
		
		@Override
		public Customer deleteCustomer(int custId) {
			Customer cust = findCustomerById(custId);
			if(cust != null) {
				System.out.println("deleted customer with Id " + custId);
				System.out.println("");
				custArray.remove(cust);
				return null;
			}

			//no customer with custId found
			System.out.println("no customer with given Id");
			System.out.println("");
			return null;
		}
	
		@Override
		public Customer editCustomer(Customer cust, int custId) throws NotDeliveringAtLocationException {
			if(notDelivering.contains(cust.getLocation())) {
				throw new NotDeliveringAtLocationException(cust.getLocation());
			}
			
			Customer custOld = findCustomerById(custId);
			if(custOld != null) {
				custArray.remove(custOld);
				custArray.add(cust);
				System.out.println("customer edited on details " + custId);
				
				System.out.println("");
				
				return cust;
			}
			//no customer with custId found
			System.out.println("no customer with given Id " + custId);
			System.out.println("");
			return null;
		}
}
