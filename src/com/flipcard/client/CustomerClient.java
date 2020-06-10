/**
 * 
 */
package com.flipcard.client;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.flipcard.bean.Customer;
import com.flipcard.exception.NotDeliveringAtLocationException;
import com.flipcard.service.CustOperation;
import com.flipcard.service.Operation;

/**
 * @author Lenovo
 *
 */
public class CustomerClient {
	private static Logger logger = Logger.getLogger(CustOperation.class);
	
	public static void main(String[] args) {
		logger.info("Program Started");
		arrayExample();
	}
	
	public static void arrayExample() {
		Scanner sc = new Scanner(System.in);
		Operation operation = new CustOperation();
		do {
			logger.info("0. To Exit");
			logger.info("1. To add");
			logger.info("2. To delete");
			logger.info("3. To edit");
			logger.info("4. To print all customer");
			logger.info("5. To print customer");
			
			int input = sc.nextInt();
			if(input == 1) {
				//add customer
				try {
					operation.addCustomer(getCustomer());
				} catch (NotDeliveringAtLocationException e) {
					// TODO Auto-generated catch block
					logger.error(e.getMessage());
				}
			} else if(input == 2) {
				//delete customer
				logger.debug("Enter Customer Id to Delete");
				operation.deleteCustomer(sc.nextInt());
			} else if(input == 3) {
				//edit customer
				logger.debug("Enter Customer Id");
				int custId = sc.nextInt();
				try {
					operation.editCustomer(getCustomer(), custId);
				} catch (NotDeliveringAtLocationException e) {
					// TODO Auto-generated catch block
					logger.error(e.getMessage());
				}
			} else if(input == 4) {
				//print all customer
				operation.printAllCustomer();
			} else if(input == 5) {
				//print specific customer with given Id
				int id = sc.nextInt();
				operation.printCustomer(id);
			} else {
				//wrong input
				break;
			}
			
		}while(true);
		
		//End of program
		logger.debug("End of Program");
		
	}
	
	public static Customer getCustomer() {
		//use to take input details of customer
		Customer cust = new Customer();
		Scanner sc = new Scanner(System.in);
		logger.info("ID?");
		cust.setCustId(sc.nextInt());
		logger.info("Name?");
		cust.setCustName(sc.next());
		logger.info("Address?");
		cust.setCustAddress(sc.next());
		logger.info("Location?");
		cust.setLocation(sc.next());
		return cust;
	}
}
