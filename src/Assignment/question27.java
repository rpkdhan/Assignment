package Assignment;

import java.util.Scanner;

public class question27 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter number: ");
		int n = input.nextInt();
		
		int sum=0;
		int prod = 1;
		 System.out.println("n is: " +n);

		while (n!= 0) {
			int temp = n % 10;
			sum = sum +temp; 
			prod = prod * temp;
			n = n/10;
		}
		System.out.println("sum of digit is: "+sum);
		System.out.println(" multiplication of digit is : " +prod);
		input.close();

	}
}

