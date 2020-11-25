package Assignment;

import java.util.Scanner;

public class question24factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter number: ");
		int n = input.nextInt();
		int fact = 1;
		for(int i = 1; i <=n; i++) {
			fact = fact * i;
		}
		System.out.println("the factorial of the number is :" +fact);
	 input.close();
	}

}
