package com.flipcard.bean.service;
import java.util.ArrayList;
import java.util.List;

import com.flipcard.bean.Customer;

public class CustOperation implements Operation {
//	Customer[] custArray = new Customer[100];
//	int size = 0;
	List<Customer> custArray = new ArrayList<Customer>();
	
		@Override
		public Customer addCustomer(Customer cust) {
//			if(size >= 100) {
//				System.out.println("memory full");
//				return null;
//			}
//			System.out.println("Adding Customer" + cust);
//			custArray[size] = cust;
//			size++;
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
		
//		@Override
//		public void shiftCustomer() {
//			int i=0, j=0;
//			while(j<size) {
//				if(custArray[j]!=null) {
//					custArray[i] = custArray[j];
//					if(i!=j) {
//						custArray[j]=null;
//					}
//					i++;
//				}
//				j++;
//			}
//			size = i;
//		}
		
		@Override
		public Customer deleteCustomer(int custId) {
			for(int i=0; i<custArray.size();i++) {
				if(custArray.get(i).getCustId() == custId) {
					//customer with custId will get deleted here
					System.out.println("deleted customer with Id " + custId);
					System.out.println("");
					custArray.remove(i);
					return null;
				}
			}
			//no customer with custId found
			System.out.println("no customer with given Id");
			System.out.println("");
			return null;
		}
	
		@Override
		public Customer editCustomer(Customer cust, int custId) {
		
			for(int i=0; i<custArray.size();i++) {
				if(custArray.get(i).getCustId() == custId) {
					//customer with custId will get deleted here
					custArray.set(i, cust);
					System.out.println("customer edited on details " + custId);
					
					String custEdit="edited customer";
					System.out.println("");
					
					return cust;
				}
			}
			//no customer with custId found
			System.out.println("no customer with given Id " + custId);
			System.out.println("");
			return null;
		}
}
