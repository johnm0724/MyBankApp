package LoginConnections;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import CustomerManager.CustomerAccountPage;
import CustomerManager.Customers;
import Pages.SignUp;

public class LoginPage{

	
//	static Customers cust = new Customers();
//	JFrame frame = new JFrame();
//	JButton loginButton = new JButton("Login");
//	JButton resetButton = new JButton("Reset");
//	JButton createButton = new JButton("Sign up");
//	JTextField userIDField = new JTextField();
//	JPasswordField userPasswordField = new JPasswordField();
//	JLabel userIDLabel = new JLabel("User ID:");
//	JLabel userPasswordLabel = new JLabel("Password:");
//	JLabel createNewUser = new JLabel("Sign up");
//	JLabel messageLabel = new JLabel();
	static Scanner scan = new Scanner(System.in);
	static LoginConnection lc = new LoginConnection();
	HashMap<String, String> loginInfo = new HashMap<String,String>();
	
	
	public LoginPage(HashMap<String,String> loginInfodb){
		
		
		loginInfo = loginInfodb;
		
//		
//		// x, y, width and height for the set bounds
//		
//		userIDLabel.setBounds(50,100,75,25);
//		userPasswordLabel.setBounds(50,150,75,25);
//		
//		messageLabel.setBounds(125,250,250,35);
//		messageLabel.setFont(new Font(null,Font.ITALIC,25));
//		
//		userIDField.setBounds(125, 100, 200, 25);
//		userPasswordField.setBounds(125, 150, 200, 25);
//		
//		loginButton.setBounds(125, 200, 100, 25);
//		loginButton.addActionListener(this);
//		loginButton.setFocusable(false);
//		
//		resetButton.setBounds(225, 200, 100, 25);
//		resetButton.addActionListener(this);
//		resetButton.setFocusable(false);
//		
//		createButton.setBounds(225,250,100,25);
//		createButton.addActionListener(this);
//		createButton.setFocusable(false);
//		
//		frame.add(userIDLabel);
//		frame.add(userPasswordLabel);
//		frame.add(messageLabel);
//		frame.add(userIDField);
//		frame.add(userPasswordField);
//		frame.add(loginButton);
//		frame.add(resetButton);
//		frame.add(createButton);
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(520,520);
//		frame.setLayout(null);
//		frame.setVisible(true);
		actionPerformed(scan);
		
	}
		public void actionPerformed(Scanner scanner) {
			System.out.println("Enter username");
		String userID = scan.nextLine(); 
		System.out.println("enter Password");
		String  password = scan.nextLine();
	
	if(loginInfo.get(userID).equals(password)) {	 
			System.out.println("login Successful");
	   }
	else {
			System.out.println("Wrong pasword");
           }
	
	
 }
	
	
//	
//	public void actionPerformed(ActionEvent e) {
////		if(e.getSource()== resetButton) {
////			userIDField.setText("");
////			userPasswordField.setText("");
////		}
//		
//		if(e.getSource()==loginButton) {
//			String userID = userIDField.getText();
//			String password = String.valueOf(userPasswordField.getPassword());
//			
//			
//			if(loginInfo.get(userID).equals(password)){
//				messageLabel.setForeground(Color.green);
//				messageLabel.setText("login Successful");
////				frame.dispose();
//				//will take you to the next page you want
//				CustomerAccountPage customerAccountPage = new CustomerAccountPage(userID);
//			}
//			else {
//				messageLabel.setForeground(Color.red);
//				messageLabel.setText("wrong password!");
//			}
//		}
//		else {
//			messageLabel.setForeground(Color.red);
//			messageLabel.setText("username not found!");
//		}
//		
//		if(e.getSource() == createButton) {
//			//go to new page to make a new account
//			SignUp signup = new SignUp();
//		}
//	}
}
