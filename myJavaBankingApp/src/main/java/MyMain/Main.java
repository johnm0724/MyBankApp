package MyMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import AccountMan.*;
import LoginConnections.*;
import Pages.Menu;
import CustomerManager.*;
;public class Main {
  static Customers cust = new Customers();
  static LoginConnection lc = new LoginConnection();
  static AccountManager am = new AccountManager();
  static Checking ch = new Checking();
  static Menu menu = new Menu();
  static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
//			
		UsernameAndPassword uap = new UsernameAndPassword();//works
		
		 LoginPage loginPage = new LoginPage(uap.getLoginInfo());//works
		 menu.startMenu();
		 
		 
		 
		
		
	}
		
		


}
	
	

