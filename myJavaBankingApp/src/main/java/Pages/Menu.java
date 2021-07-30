package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {

	
	public static void startMenu() throws SQLException {
        int option = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to myBanking." + "username");
		System.out.println("What would you like to do today");
		System.out.println("1. Check Balance.");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Add Account");
		System.out.println("5. Delete customer");
		System.out.println("6. Exit");
		do {
			System.out.println("====================");
			System.out.println("What would you like to do.\n Pick an option");
			System.out.println("====================");
			option = scan.nextInt();
			
			
			switch(option) {
			case 1:
				System.out.println("**************");
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement stmt = conn.createStatement();
				System.out.println("Enter the account id you want to check:");
				int cust_id = scan.nextInt();
				ResultSet rs = stmt.executeQuery("SELECT * FROM account where id = '"+cust_id+"'");
				while(rs.next()) {
					double id = rs.getInt("account_balance");
					System.out.println("Your balance is: " + id);
				}
				System.out.println("**************");
			
			break;
			
			case 2:
				System.out.println("**************");
				System.out.println("Enter the amount you wish to deposit");
				System.out.println("**************");
				//ch.deposit(scan.nextDouble());
				Connection conn1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement st = conn1.createStatement();
				System.out.println("Enter the account id:");
				int cust_id1 = scan.nextInt();
				ResultSet rs1 = st.executeQuery("SELECT * FROM account where id = '"+cust_id1+"'");
				while(rs1.next()) {
					double id = rs1.getInt("account_balance");
					System.out.println("Your current balance is: " + id +" ");
					System.out.println("enter the amount you want to deposit.");
					double amount = scan.nextDouble();
					amount += id;
					Statement st1 = conn1.createStatement();
				    st1.executeUpdate("UPDATE account SET account_balance = '"+amount+"' WHERE id = '"+cust_id1+"' ");
					System.out.println("Your new balance is: "+amount);
				
				}			break;
			
			case 3:
				System.out.println("***************");
				System.out.println("withdraw menu");
				System.out.println("***************");
				Connection conn2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement stmt1 = conn2.createStatement();
				System.out.println("Enter the account id:");
				int cust_id2 = scan.nextInt();
				ResultSet rs2 = stmt1.executeQuery("SELECT * FROM account where id = '"+cust_id2+"'");
				while(rs2.next()) {
					double id = rs2.getDouble("account_balance");
					System.out.println("Your current balance is: " + id +" ");
					System.out.println("enter the amount you want to withdraw.");
					double amount = scan.nextDouble();
					double balance = ( id - amount);
					Statement st2 = conn2.createStatement();
				    st2.executeUpdate("UPDATE account SET account_balance = '"+balance+"' WHERE id = '"+cust_id2+"' ");
					System.out.println("Your new balance is: "+ balance);
				    
				}
			break;
			
			case 4:
				System.out.println("***************");
				System.out.println("New account menu");
				System.out.println("***************");
				Connection conn4 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement st4  = conn4.createStatement();
				System.out.println("Enter Username");
				String custName = scan.next();
				System.out.println("Enter Password");
				String custPwd = scan.next();
				System.out.println("Enter Email");
				String custEmail = scan.next();
				System.out.println("Enter Age");
				int custAge = scan.nextInt();
				st4.executeUpdate("INSERT INTO customer_login VALUES ('"+custName+"','"+custPwd+"')");
				st4.executeUpdate("INSERT INTO customers VALUES ('"+custName+"','"+custPwd+"','"+custEmail+"','"+custAge+"')");
				System.out.println("Your input was successful");
				
			break;
			
			case 5:
				System.out.println("***************");
				System.out.println("Delete account menu");
				System.out.println("***************");
				Connection conn5 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement stmt5 = conn5.createStatement();
				System.out.println("Delete user by Id.\n Enter the id you wans to delete.");
				int custdelete = scan.nextInt();
				stmt5.executeQuery("DELETE FROM customers where id = '"+custdelete+"' ");
				System.out.println("You have deleted customer");
			
			 default:
				 System.out.println("Invalid Option!! ");
			}
		 }while(option != 6); {
			System.out.println("Thank for banking with myBankApp. ");
		     }
	
}
	
}
