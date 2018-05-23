/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shweta Shivraj Mangrule
 *
 */
public class Bank {
	
	private String bankName;
	private List<Customer>customers;
	
	/**
	 * @param string 
	 * @param customers
	 */
	public Bank(String string) {
		super();
		this.bankName = bankName;
		this.customers = new ArrayList<>();
	}


	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void addCustomer(Customer cust) {
		customers.add(cust);
		
	}
	public Customer getCustomer(int customerId) {
		
		for(Customer c : customers) {
			if(c.getCustId() == customerId) {
				return c;
			}
		}
			
		return null;
		//return null;
		
	}	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
