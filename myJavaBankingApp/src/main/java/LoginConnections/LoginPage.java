package LoginConnections;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Scanner;

import Pages.Menu;
 public class LoginPage{


	static Scanner scan = new Scanner(System.in);
	static LoginConnection lc = new LoginConnection();
	HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	
	public LoginPage(HashMap<String,String> loginInfodb) throws SQLException{
		
		
		loginInfo = loginInfodb;
		
		actionPerformed(scan);
		
	}
		public void actionPerformed(Scanner scanner) throws SQLException {
			System.out.println("Enter username");
		String userID = scan.nextLine(); 
		System.out.println("Enter Password");
		String  password = scan.nextLine();
	
	if(loginInfo.get(userID).equals(password)) {
			System.out.println("login Successful");
			 Menu.startMenu();
	   }
	else {
			System.out.println("Wrong pasword");
           }
	
	
 }
	

}
