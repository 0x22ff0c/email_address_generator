package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.EmailAddressGenerator;

public class UnitTest {

	@Test
	public void testEmailAddress(){
		
		EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();
		emailAddressGenerator.generateEmailName();
		
		assertTrue(emailAddressGenerator.generateEmailAddress("@yahoo.com").contains("@yahoo.com"));
		
	}
	
	
}
