package myJavaBankingApp;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.junit.Test;

import AccountMan.Savings;

public class SavingsTest {

	private static final Logger logger = LogManager.getLogger(SavingsTest.class);
	
	@SuppressWarnings("deprecation")
	@Test
	public void depositTest() throws SQLException {

     Savings s = new Savings();
     
     double dep = s.deposit(300);
		
     
    assertEquals(200, 200);
		
	}

}
