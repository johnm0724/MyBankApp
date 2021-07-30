package AccountMan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {

	static Scanner scan = new Scanner(System.in);
	
		
		public static void makeAccount() {
			try {
				
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement st  = conn.createStatement();
				System.out.println("Enter account holder name");
				String acctName = scan.next();
				System.out.println("Enter account number");
				int acctNum = scan.nextInt();
				System.out.println("Enter account type");
				String acctType = scan.next();
				System.out.println("The dollar amount you wish to deposit");
				int acctBal = scan.nextInt();
				
				
				st.executeUpdate("INSERT INTO account VALUES ('"+acctName+"','"+acctNum+"','"+acctType+"','"+acctBal+"')");
				System.out.println("Your input was successful");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		public static void deleteAccount() {
			try {
				
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
				Statement stmt = conn.createStatement();
			    stmt.executeQuery("DELETE FROM account");
				System.out.println("Your input was successful");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
			
	
}
