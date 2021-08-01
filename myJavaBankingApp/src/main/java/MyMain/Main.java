package MyMain;

import java.sql.SQLException;
import java.util.Scanner;
import LoginConnections.*;
import LoginConnections.LoginPage;
;public class Main {

  
  static Scanner scan = new Scanner(System.in);
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
			
		UsernameAndPassword uap = new UsernameAndPassword();
		
		 LoginPage loginPage = new LoginPage(uap.getLoginInfo());	
		
	}
		
		


}
	
	

