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
		
		assertTrue(emailAddressGenerator.generateEmailAddress().contains(domainName));
		
	}
	
	@Test
	public void testIfEmailIsIncorrectFormat(){
		
		emailAddressGenerator.generateEmailName();
		
		String domainName = "gmail.com";
		
		String emailAddress = emailAddressGenerator.generateEmailAddress();
		
		assertTrue(emailAddress.matches("[0-9|A-Z|a-z].*@" + domainName));
		
	}
	
}
