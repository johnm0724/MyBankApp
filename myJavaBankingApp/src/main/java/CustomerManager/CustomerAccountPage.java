package CustomerManager;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerAccountPage {

	static Scanner scan = new Scanner(System.in);
	JFrame frame = new JFrame();
	JLabel customerAccountPageLabel = new JLabel();
	JLabel accountPageLabel = new JLabel();
	JButton checkBal = new JButton();
	JTextField checkBalField = new JTextField();
	JLabel userIDLabel = new JLabel("User ID:");
	public CustomerAccountPage(String userId){
	
		accountPageLabel.setBounds(50,30,250,15);
		accountPageLabel.setText("Welcome "+userId +" to myBanking App.");
		
		
		checkBal.setBounds(15,75,75,25);
		checkBalField.setBounds(30, 75, 50, 10);
		
		frame.setTitle("Hello "+ userId);
		
		frame.add(customerAccountPageLabel);
		frame.add(accountPageLabel);
		frame.add(checkBal);
		frame.add(checkBalField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520,520);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
