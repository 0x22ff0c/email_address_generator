import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		System.out.println("Random email address generator");

		Main sampleClass = new Main();
		
		String domainName = sampleClass.setDomainName();
		
		sampleClass.generateEmailAddress(domainName);
		
	}

	private String setDomainName(){
		
		System.out.print("Enter a domain name: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String domainName = scanner.nextLine();
		
		scanner.close();
		
		return domainName;
		
	}
	
	private void generateEmailAddress(String domainName){
		
		Random random = new Random();
		
		String[] charArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int index = 0; index <= 10; index++){
			
			stringBuilder.append(charArray[random.nextInt(charArray.length)]);
			
		}
		
		System.out.println(String.format("Generated email address: %s", stringBuilder.toString() + "@" + domainName));
		
	}
	
}