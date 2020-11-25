package Assignment;

import java.util.Scanner;

public class question29sumoffactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter the number: ");
		int n = input.nextInt();
		 
		int fact = 1;
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			fact = fact*i;
			sum = sum + (i/fact);
			
		}
		System.out.println(" sum of factorial of your number is: "+ sum);

	}

}
