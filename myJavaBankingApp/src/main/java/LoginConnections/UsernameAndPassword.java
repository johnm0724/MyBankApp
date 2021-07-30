package LoginConnections;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import CustomerManager.Customers;

public class UsernameAndPassword {
	
	
	

	public HashMap<String,String> loginInfo = new HashMap<String, String>();
	{
	   try{
		   Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","johnm0803");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT username,password FROM customer_login");
            while(rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("password");
                // set data in the hashmap
                loginInfo.put(username, password);
            }
        }catch(Exception ex){
        	Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
	  
	}
	public HashMap<String, String> getLoginInfo() {
		// TODO Auto-generated method stub
		return this.loginInfo;
	}
	
	 
	    	  
}
