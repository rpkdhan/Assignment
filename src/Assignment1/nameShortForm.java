package Assignment1;

import java.util.Scanner;

public class nameShortForm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Write a Person Name!!");
		String S = input.nextLine();
		int c=0;
		int p = S.length(); // calculating length of String
		char ch = S.charAt(0); // extracting the first letter of name
		System.out.print(ch+".");	
		for (int i = 1; i < p; i++) {
			char ch1 = S.charAt(i);
			if (char(S.charAt(i)== " ")) // checking whether its a space or not
			{
				System.out.print(S.charAt(i+1));// printing the letter after the space
				c=i+1;//calculating position of letter after space
			}
		}
		for (int n = c+1; n < p; n++) {
			System.out.print(S.charAt(n));// printing all the remaining word of the last name.
		}
		System.out.print("");
	
	}

}
