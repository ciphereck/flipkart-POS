package com.flipcard.bean.service;
import com.flipcard.bean.Customer;

public class CustOperation implements Operation {
	Customer[] custArray = new Customer[100];
	int size = 0;
	
		@Override
		public Customer addCustomer(Customer cust) {
			if(size >= 100) {
				System.out.println("memory full");
				return null;
			}
			System.out.println("Adding Customer" + cust);
			custArray[size] = cust;
			size++;
			return cust;
		}
		
		@Override
		public void printAllCustomer() {
			for(int i=0; i<size; i++) {
				printCustomer(custArray[i]);
			}
		}
		
		@Override
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
		
		@Override
		public void shiftCustomer() {
			int i=0, j=0;
			while(j<size) {
				if(custArray[j]!=null) {
					custArray[i] = custArray[j];
					if(i!=j) {
						custArray[j]=null;
					}
					i++;
				}
				j++;
			}
			size = i;
		}
		
		@Override
		public Customer deleteCustomer(int custId) {
			for(int i=0; i<size;i++) {
				if(custArray[i] != null && custArray[i].getCustId() == custId) {
					custArray[i] = null;
					System.out.println("deleted customer with Id " + custId);
					System.out.println("");
					shiftCustomer();
					return null;
				}
			}
			System.out.println("no customer with given Id");
			System.out.println("");
			return null;
		}
	
		@Override
		public Customer editCustomer(Customer cust, int custId) {
		
			for(int i=0; i<size;i++) {
				if(custArray[i] != null && custArray[i].getCustId() == custId) {
					custArray[i] = cust;
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
}
