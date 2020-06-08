/**
 * 
 */
package com.flipcard.client;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		Operation op = new CustOperation();
		do {
			System.out.println("0. To Exit");
			System.out.println("1. To add");
			System.out.println("2. To delete");
			System.out.println("3. To edit");
			System.out.println("4. To print list");
			
			int input = sc.nextInt();
			if(input == 1) {
				op.addCustomer(getCustomer());
			} else if(input == 2) {
				System.out.println("Enter Customer Id to Delete");
				op.deleteCustomer(sc.nextInt());
			} else if(input == 3) {
				System.out.println("Enter Customer Id");
				int custId = sc.nextInt();
				op.editCustomer(getCustomer(), custId);
			} else if(input == 4) {
				op.printAllCustomer();
			} else {
				break;
			}
			
		}while(true);
		
		System.out.println("End of Program");
		
	}
	
	public static Customer getCustomer() {
		Customer cust = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID?");
		cust.setCustId(sc.nextInt());
		System.out.println("Name?");
		cust.setCustName(sc.next());
		System.out.println("Address?");
		cust.setCustAddress(sc.next());
		System.out.println("Location?");
		cust.setLocation(sc.next());
		return cust;
	}
}
