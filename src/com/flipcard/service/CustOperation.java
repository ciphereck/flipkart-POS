package com.flipcard.service;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.flipcard.bean.Customer;
import com.flipcard.exception.NotDeliveringAtLocationException;

public class CustOperation implements Operation {
		List<Customer> custArray = new ArrayList<Customer>();
		List<String> notDelivering = new ArrayList<String>();
		private static Logger logger = Logger.getLogger(CustOperation.class);
		
		public CustOperation() {
			notDelivering.add("Delhi");
			notDelivering.add("Jaipur");
		}
	
		@Override
		public Customer addCustomer(Customer cust) throws NotDeliveringAtLocationException {
			if(notDelivering.contains(cust.getLocation())) {
				throw new NotDeliveringAtLocationException(cust.getLocation());
			}
			custArray.add(cust);
			logger.debug("Added Customer " + cust.getCustId());
			return cust;
		}
		
		@Override
		public void printAllCustomer() {
			if(custArray.size()==0) {
				logger.debug("no customer here. Please add new customers");
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
			logger.debug("printing customer");
			if(cust == null) {
				// if customer reference is null
				logger.debug("no customer");
				return;
			}
			logger.info(cust.getCustId());
			logger.info(cust.getCustName());
			logger.info(cust.getCustAddress());
			logger.info(cust.getLocation());
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
				logger.debug("deleted customer with Id " + custId);
				custArray.remove(cust);
				return null;
			}

			//no customer with custId found
			logger.debug("no customer with given Id");
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
				logger.debug("customer edited on details " + custId);
				
				
				return cust;
			}
			//no customer with custId found
			logger.debug("no customer with given Id " + custId);
			return null;
		}
}
