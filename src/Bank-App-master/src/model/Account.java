/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Shweta Shivraj Mangrule
 *
 */
public class Account {
	
	private float balance;
	private float intersetRate;
	private int period;
	private int acctId;
	private List<Statement>statements;
	

	/**
	 * @param balance
	 * @param intersetRate
	 * @param period
	 * @param acctId
	 */
	public Account(float balance, float intersetRate, int period, int acctId) {
		super();
		this.balance = balance;
		this.intersetRate = intersetRate;
		this.period = period;
		this.acctId = acctId;
		this.statements = new ArrayList<>();
	}

	/**
	 * @return the acctId
	 */
	public int getAcctId() {
		return acctId;
	}
	/**
	 * @param acctId the acctId to set
	 */
	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}
	/**
	 * @return the intersetRate
	 */
	public float getIntersetRate() {
		return intersetRate;
	}
	/**
	 * @param intersetRate the intersetRate to set
	 */
	public void setIntersetRate(float intersetRate) {
		this.intersetRate = intersetRate;
	}
	/**
	 * @return the period
	 */
	public int getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(int period) {
		this.period = period;
	}

	
	public float deposit(float depositAmt) {
		balance+= depositAmt;
		Statement s = new Statement(new Date(), depositAmt+"  Credit "+balance);
		statements.add(s);
		return depositAmt;
		
	}
	public float withdraw(float withdrawAmt) throws Exception {
		if(balance<withdrawAmt) {
			throw new Exception("Low Balance");
		}
		balance-= withdrawAmt;
		Statement s = new Statement(new Date(), withdrawAmt+" Debit "+balance);
		statements.add(s);
		
		return withdrawAmt;	
	}
	
	public List<Statement> getStatement() {
		
		return statements;
	}
}
