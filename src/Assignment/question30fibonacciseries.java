package Assignment;

import java.util.Scanner;

public class question30fibonacciseries {

	public static void main(String[] args) {
		System.out.println("enter the number for sequence: ");
		Scanner input = new Scanner(System.in);
		int series = input.nextInt();
		
		int first = 1;
		int second = 1;
		
		System.out.print(first +" ");
		for (int i = 1; i <= series; i++) {
			System.out.print( second+ " ");
			int temp = first + second;
			first = second;
			second = temp;
		}
	}

}
