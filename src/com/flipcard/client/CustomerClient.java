/**
 * 
 */
package com.flipcard.client;

import com.flipcard.bean.Customer;
import com.flipcard.bean.service.CustOperation;
import com.flipcard.bean.service.Operation;

/**
 * @author Lenovo
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
		arrayExample();
	}
	
	public static void arrayExample() {
		Operation op = new CustOperation();
		for(Integer i=0; i<5; i++) {
			op.addCustomer(getCustomer(i));
		}
		
		op.printAllCustomer();
		
		System.out.println("");
		
		op.deleteCustomer(2);
		
		System.out.println("");
		
		op.editCustomer(getCustomer(6), 3);
		op.editCustomer(getCustomer(8), 10);
		
		System.out.println("");
		
		op.printAllCustomer();
		
	}
	
	public static Customer getCustomer(Integer id) {
		Customer cust = new Customer();
		cust.setCustId(id);
		cust.setCustName("flipcard" + id.toString());
		cust.setCustAddress("Delhi" + id.toString());
		cust.setLocation("India" + id.toString());
		return cust;
	}
}
