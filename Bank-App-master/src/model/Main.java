/**
 * 
 */
package model;

import java.util.Scanner;

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
//		a1.deposit(5000.00f);
//		System.out.println(a1.getStatement());
//		a1.withdraw(100.00f);
//		System.out.println(a1.getStatement());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----Welcome to BankApplication----");
		
		//System.out.println(" Select your option");
		System.out.println("1. Saving Account");
		System.out.println("2. Flexible Account");
		System.out.println("3. Checking Account");
		

		System.out.println("Please Select:");
		int choice =Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			Account a11 = new Account();
			System.out.println("SavingAccount");
			System.out.println("1. Withdraw Amount");
			System.out.println("2. Deposit Amount");
			System.out.println("Please Select:");
			int choice1 =Integer.parseInt(sc.nextLine());
			switch (choice1) {
			case 1:
			a1.withdraw(100.00f);
			System.out.println(a1.getStatement());
			
			case 2:
				a1.deposit(5000.00f);
				System.out.println(a1.getStatement());
				
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
			break;
		case 2:
			
			Account a12 = new Account();
			System.out.println("Flexible Account");
			System.out.println("1. Withdraw Amount");
			System.out.println("2. Deposit Amount");
			switch (choice) {
			case 1:
				a1.withdraw(100.00f);
				System.out.println(a1.getStatement());
				break;
			case 2:
				a1.deposit(5000.00f);
				System.out.println(a1.getStatement());
				break;

			default:
				System.out.println("Inavlid Choice");
				break;
			}
			
		default:
			System.out.println("Inavlid choice");
			break;
		}
		sc.close();	
		
	}

}
