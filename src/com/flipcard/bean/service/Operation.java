package com.flipcard.bean.service;

import com.flipcard.bean.Customer;
import com.flipcard.exception.NotDeliveringAtLocationException;

public interface Operation {
	public Customer addCustomer(Customer cust) throws NotDeliveringAtLocationException;
	public void printAllCustomer();
	public void printCustomer(Customer cust);
	public void printCustomer(int id);
//	public void shiftCustomer();
	public Customer deleteCustomer(int custId);
	public Customer editCustomer(Customer cust, int custId) throws NotDeliveringAtLocationException;
}
