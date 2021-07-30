package CustomerManager;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;




public class Customers {
	static Scanner scan = new Scanner(System.in);
	//make a button to make a new customer
	public static void makeCustomer() {
		try {
			//this will be the customer sing up page
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement st  = conn.createStatement();
			System.out.println("Enter Username");
			String custName = scan.next();
			System.out.println("Enter Password");
			String custPwd = scan.next();
			System.out.println("Enter Email");
			String custEmail = scan.next();
			System.out.println("Enter Age");
			int custAge = scan.nextInt();
			st.executeUpdate("INSERT INTO customer_login VALUES ('"+custName+"','"+custPwd+"')");
			st.executeUpdate("INSERT INTO customers VALUES ('"+custName+"','"+custPwd+"','"+custEmail+"','"+custAge+"')");
			System.out.println("Your input was successful");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//how it get all customers 
	private static void customerId() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT id FROM customers");
		while(rs.next()) {
			String id = rs.getString("id");
			System.out.println(id);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}
	//get customer by id (one)
	public static void customerById() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			System.out.println("Enter the customer id:");
			int cust_id = scan.nextInt();
			ResultSet rs = stmt.executeQuery("SELECT * FROM customers where id = '"+cust_id+"' ");
			while(rs.next()) {
				String id = rs.getString("username");
				System.out.println(id);
			}
		}catch(SQLException e){
			e.printStackTrace();
		     }
		
		}
	//gets all the user names 
	private static void customerUserName() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT username FROM customers");
		System.out.println("All customers usernames.");
		while(rs.next()) {
			String username = rs.getString("username");
			System.out.println(username);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}
	//gets all the user's passwords 
	private static void customerPwd() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT password FROM customers");
		System.out.println("All customers pwd for now.");
		while(rs.next()) {
			String password = rs.getString("password");
			System.out.println(password);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}
	//gets all the user's emails
	private static void customerEmail() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT customeremail FROM customers");
		System.out.println("All customers emails addresses.");
		while(rs.next()) {
			String customeremail = rs.getString("customeremail");
			System.out.println(customeremail);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}
	//gets all the user's ages 
	private static void customerAge() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT age FROM customers");
		System.out.println("All customers ages.");
		while(rs.next()) {
			int age = rs.getInt("age");
			System.out.println(age);
		}
	  }catch(SQLException e){
		e.printStackTrace();
	     }
	
	}
	
	//deletes all users
	public static void deleteUsernames() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			System.out.println("Delete user by Id.\n Enter the id you wans to delete.");
			int custdelete = scan.nextInt();
			stmt.executeQuery("DELETE FROM customers where id = '"+custdelete+"' ");
		  }catch(SQLException e){
			//e.printStackTrace();
		     }
		
		}
	
	public static void deleteAllUsernames() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
			Statement stmt = conn.createStatement();
			int custdelete = scan.nextInt();
			stmt.executeQuery("DELETE * FROM customers");
		  }catch(SQLException e){
			//e.printStackTrace();
		     }
		
		}
	
	

}







