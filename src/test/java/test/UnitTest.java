package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.EmailAddressGenerator;

public class UnitTest {

	EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();

	@Test
	public void testIfDomainNameExists(){
		
		emailAddressGenerator.generateEmailName();
		
		String domainName = "@yahoo.com";
		
		emailAddressGenerator.setDomainName(domainName);

		assertTrue(emailAddressGenerator.generateEmailAddress().contains(domainName));
		
	}
	
	@Test
	public void testIfEmailIsIncorrectFormat(){
		
		emailAddressGenerator.generateEmailName();
		
		String domainName = "gmail.com";
		
		emailAddressGenerator.setDomainName(domainName);
		
		String emailAddress = emailAddressGenerator.generateEmailAddress();
		
		assertTrue(emailAddress.matches("[0-9|A-Z|a-z].*@" + domainName));
		
	}
	
	@Test
	public void testIfEmailLengthIsCorrect(){
		
		emailAddressGenerator.generateEmailName();
		
		int totalExpectedNumberOfCharacters = 10;
		
		assertEquals(totalExpectedNumberOfCharacters, emailAddressGenerator.getEmailName().length());
		
	}
	
}
