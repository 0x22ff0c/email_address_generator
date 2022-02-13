package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.EmailAddressGenerator;

public class UnitTest {

	EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();

	@Test
	public void testIfDomainNameExists(){
		
		emailAddressGenerator.generateEmailName();
		
		String domainName = "@yahoo.com";
		
		assertTrue(emailAddressGenerator.generateEmailAddress(domainName).contains(domainName));
		
	}
	
	@Test
	public void testIfEmailIsIncorrectFormat(){
		
		emailAddressGenerator.generateEmailName();
		
		String domainName = "gmail.com";
		
		String emailAddress = emailAddressGenerator.generateEmailAddress(domainName);
		
		assertTrue(emailAddress.matches("\\s.*@"+domainName));
		
	}
	
}
