/**
 * 
 */
package com.flipcard.client;

import com.flipcard.bean.Customer;
import com.flipcard.bean.service.CustOperation;

/**
 * @author Lenovo
 *
 */
public class CustomerClient {
	public static void main(String[] args) {
//		Customer cust=new Customer();
//		cust.setCustId(101);
//		cust.setCustName("flipcard");
//		cust.setCustAddress("Delhi");
//		cust.setLocation("India");
//		CustOperation custOpt=new CustOperation();
//		System.out.println(custOpt.addCustomer(cust));
		
		//	System.out.println(cust.deleteCustomer(101));
		//	System.out.println(cust.updateCustomer("updated"));
		//	System.out.println(cust.editCustomer("edited"));
		
		arrayExample();
	}
	
	public static void arrayExample() {
		CustOperation custOpt = new CustOperation();
		for(Integer i=0; i<5; i++) {
			custOpt.addCustomer(getCustomer(i));
		}
		
		custOpt.printAllCustomer();
		
		System.out.println("");
		
		custOpt.deleteCustomer(2);
		
		System.out.println("");
		
		custOpt.editCustomer(getCustomer(6), 3);
		custOpt.editCustomer(getCustomer(8), 10);
		
		System.out.println("");
		
		custOpt.printAllCustomer();
		
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
