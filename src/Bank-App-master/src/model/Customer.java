/**
 * 
 */
package model;
import java.util.*;
import model.Account;
/**
 * @author Shweta Shivraj Mangrule
 *
 */
public class Customer {

	private String firstName;
	private String lastName;
	private List<Account> accounts;
	private int custId;
	
	
	/**
	 * @param custId
	 * @param lastName
	 * @param firstName
	 */
	public Customer(int custId, String lastName, String firstName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.custId = custId;
		this.accounts = new ArrayList<>();
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Account getAccounts(int acctId) {
		for(Account a: accounts) {
			if(a.getAcctId()==acctId) {
			return a;
			}
		}
		return null;
	
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account act) {
		accounts.add(act);
		
	}
	public Account getAccount(int accountId) {
		return null;
		
	}
}
