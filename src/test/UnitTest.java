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
	
}
