package Conn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;


public class Connect {

	
	
	Properties prop = new Properties();
	
	//FileInputStream fileStream = new FileInputStream("C:\\Users\\johnm\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\myJavaBankingApp\\src\\main\\resources\\config_properties");
		
	//	prop.load(fileStream);
		
		String URL = (String)prop.get("db_url");
		String USERNAME = (String)prop.get("db_user");
		String PASSWORD = (String)prop.get("db_pwd");
		
		
//		System.out.println("URL");
//		System.out.println("USERNAME");
//		System.out.println("PASSWORD");
//	

	}

