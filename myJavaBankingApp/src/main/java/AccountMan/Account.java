package AccountMan;

import java.sql.SQLException;

public abstract class Account {

	protected double balance;
	private int accountNumber;
	private String accountHolderName;
	
	
	
	
	public Account() {
		
	}
	
	public Account(int accountNumber,String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		balance = 0;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	/**
	 * 
	 * @param amount
	 * @return
	 * @throws SQLException 
	 */
	
	public abstract double deposit(double amount) throws SQLException;

	public abstract double withdraw(double amount) throws SQLException;
	
	
}
