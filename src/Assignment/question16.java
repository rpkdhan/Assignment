package Assignment;

import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int a = input.nextInt();
		
		if (a%2 == 0) {
			System.out.println(" it is even number");
			
		}
		else { 
			System.out.println(" it is odd number");
		}
			
	}

}
