package AccountMan;

public class Savings extends Account {

	
	protected double interestRate = 2.7;
	
	protected double Interest;
	
	protected double balance = 0;
	
	
	public Savings() {
		super();
	}
	
	public Savings(int accountName, String accountHolderName,Double interest) {
		super( accountName, accountHolderName);
		Interest = interest; 
		
		
		
	}
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	
	public double deposit(double amount) {
		if(amount > 0) {
			balance += amount+(balance * interestRate);
			System.out.println("Your current balance is: " + balance);
			
		}else {
			System.out.println("A negative amount can not be added");
		}
		
		return amount;
	
	}
	
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	
	public double withdraw(double amount) {
		
		if(amount >= balance) {
			balance -= amount;
			System.out.println("Your current balance is:" + balance);
		}
		else {
			System.out.println("Insufficient funds");
		}
			
		return amount;
		
	}
}
