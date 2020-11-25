package Assignment1;

import java.util.Scanner;

public class palindromeAss {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Write your Word");
		String Original = input.next();
		
		String Reverse = "";
		for (int i = Original.length()-1; i >= 0; i--) {
			Reverse += Original.charAt(i);
			System.out.println(Reverse);
			
		}
		
		boolean palindrome = true;
		for (int i = 0; i < Original.length(); i++) {
			if(Original.charAt(i) != Reverse.charAt(i)) {
			
				palindrome = false;
			}
		}
	if (palindrome) {
		System.out.println("It is Palindrome..");
	} else {
		System.out.println("It is Not a Palindrome...");
	}
		
		
		
		
		
	}

}
