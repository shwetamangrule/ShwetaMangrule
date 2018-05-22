/**
 * 
 */
package model;

/**
 * @author Shweta Shivraj Mangrule
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Bank bank = new Bank("Axis Bank");
		Customer customer = new Customer(121,"Shrey","Naygandi");
		Account account1 = new Account(10000.00f, 4.5f, 12, 100);
		Account account2 = new Account(12200.00f, 5.5f, 6, 200);
		customer.addAccount(account1);
		customer.addAccount(account2);
		bank.addCustomer(customer);
		Customer c = bank.getCustomer(121);
		Account a1 = c.getAccounts(200);
		a1.deposit(5000.00f);
		System.out.println(a1.getStatement());
		a1.withdraw(100.00f);
		System.out.println(a1.getStatement());
		
	}

}
