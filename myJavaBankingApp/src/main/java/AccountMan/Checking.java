package AccountMan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Checking extends Account {
	
	static Scanner scan = new Scanner(System.in);	
	protected static double Fee = 1.6;
	
	public Checking() {
		
	}
	
	
	public Checking(int accountName, String accountHolderName, double fee) {
		super(accountName,accountHolderName);
		Fee = fee;
		
	}
	
	/**
	 * 
	 * @param amount
	 * @return
	 * @throws SQLException 
	 */
	
	public static void deposit() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			System.out.println("Enter the account id:");
			int cust_id = scan.nextInt();
			ResultSet rs = stmt.executeQuery("SELECT * FROM account where id = '"+cust_id+"'");
			while(rs.next()) {
				double id = rs.getInt("account_balance");
				System.out.println("Your current balance is: " + id +" ");
				System.out.println("enter the amount you want to deposit.");
				double amount = scan.nextDouble();
				amount += id;
				Statement st = conn.createStatement();
			    st.executeUpdate("UPDATE account SET account_balance = '"+amount+"' WHERE id = '"+cust_id+"' ");
				System.out.println("Your new balance is: "+amount);
			    
			
			}
		}catch(SQLException e){
			e.printStackTrace();
		     }
		
		}
	
	public double deldeposit() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement st  = conn.createStatement();
			System.out.println("Enter the id you want to delete.");
			st.executeUpdate("DELETE FROM account VALUES WHERE id = '"+scan.nextInt()+"' ");
		return balance;
	
	}
	
	
	/**
	 * 
	 * @param amount
	 * @return
	 * @throws SQLException 
	 */
	
	public static void withdraw() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			System.out.println("Enter the account id:");
			int cust_id = scan.nextInt();
			ResultSet rs = stmt.executeQuery("SELECT * FROM account where id = '"+cust_id+"'");
			while(rs.next()) {
				double id = rs.getDouble("account_balance");
				System.out.println("Your current balance is: " + id +" ");
				System.out.println("enter the amount you want to withdraw.");
				double amount = scan.nextDouble();
				double balance = ( id - amount);
				Statement st = conn.createStatement();
			    st.executeUpdate("UPDATE account SET account_balance = '"+balance+"' WHERE id = '"+cust_id+"' ");
				System.out.println("Your new balance is: "+ balance);
			    
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		     }
		
		}



	@Override
	public double deposit(double amount) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double withdraw(double amount) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
