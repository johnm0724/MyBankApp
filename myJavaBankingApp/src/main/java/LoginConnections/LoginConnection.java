package LoginConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class LoginConnection {

	
	static Scanner scan = new Scanner(System.in);
		
			
	//makes new login	
	private static void makeUserLogin() {
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			System.out.println("Creating a new username and password \n");
			Statement st  = conn.createStatement();
			System.out.println("Enter Username");
			String username = scan.next();
			System.out.println("Enter Password");
			String password = scan.next();
		
			
			st.executeUpdate("INSERT INTO customer_login VALUES ('"+username+"','"+password+"')");
			System.out.println("Your account was created");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//deletes all login info
	public static void delAllUsernames() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE FROM customer_login");
		  }catch(SQLException e){
			e.printStackTrace();
		     }
		
		}
	//gets all the user names 
	public static void getUsername() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT username FROM customer_login");
		while(rs.next()) {
			String username = rs.getString("username");
			System.out.println(username);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}

	//gets all the user passwords
	public static void getCustomerPwd() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT password FROM customer_login ");
		while(rs.next()) {
			String password = rs.getString("password");
			System.out.println(password);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}

	public String getUsername;
	public String getCustomerPwd;
	
	
	
	
}
	

