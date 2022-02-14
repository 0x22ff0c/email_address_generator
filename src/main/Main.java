package main;

public class Main {

	public static void main(String[] args){

		System.out.println("Random email address generator");
		
		EmailAddressGenerator emailAddressGenerator = new EmailAddressGenerator();
		
		emailAddressGenerator.setDomainName();
		
		emailAddressGenerator.generateEmailName();
		
		emailAddressGenerator.generateEmailAddress();
		
	}
	
}