/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author trainee
 *
 */
public class SavingAccount extends Account{
	
	private List<Statement> statements;

	public SavingAccount(float balance, float intersetRate, int period, int acctId) {
		super(balance, intersetRate, period, acctId);
		this.statements = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	@Override
	public float deposit(float depositAmt) {
		balance+= depositAmt;
		Statement s = new Statement(new Date(), depositAmt+" Debit "+balance);
		statements.add(s);
		return depositAmt;
		
	}
	
	@Override
	public float withdraw(float withdrawAmt) throws Exception {
		if(balance<withdrawAmt) {
			throw new Exception ("Low Balance");
		}
		balance-=withdrawAmt;
		return withdrawAmt;
	}
	@Override
	public List<Statement> getStatement() {
		
		return statements;
		
}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingAccount [statements=" + statements + ", balance=" + balance + ", getStatement()=" + getStatement()
				+ "]";
	}
	

}
