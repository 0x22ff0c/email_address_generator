package main;

import java.util.Random;
import java.util.Scanner;

public class EmailAddressGenerator {

	private String emailName = "";
	
	private String domainName = "";
	
	private int emailNameTotalLength = 0;
	
	public void setDomainName(String domainName){
		this.domainName = domainName;
	}
	
	public String getEmailName(){
		return emailName;
	}
	
	public void setEmailNameTotalLength(int emailNameTotalLength){
		this.emailNameTotalLength = emailNameTotalLength;
	}
	
	public String promptUserForDomainName(){
		
		System.out.print("Enter a domain name: ");
		
		Scanner scanner = new Scanner(System.in);
		
		domainName = scanner.nextLine();
		
		scanner.close();

		return domainName;
		
	}
	
	public int promptUserForEmailNameTotalLength(){
		
		System.out.print("Enter total length for email name: ");
		
		Scanner scanner = new Scanner(System.in);
		
		emailNameTotalLength = scanner.nextInt();
		
		scanner.close();
		
		return emailNameTotalLength;
		
	}
	
	public void generateEmailName(){
		
		Random random = new Random();
		
		String[] charArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int index = 0; index < 10; index++){
			
			stringBuilder.append(charArray[random.nextInt(charArray.length)]);
			
		}
		
		emailName = stringBuilder.toString();
		
	}
	
	public String generateEmailAddress(){
		
		System.out.println(String.format("Generated email address: %s", emailName + "@" + domainName));
		
		return emailName + "@" + domainName;
		
	}
	
	
}
