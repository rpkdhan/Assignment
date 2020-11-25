package Assignment;

import java.util.Scanner;

public class question18 {

	public static void main(String[] args) {
		Scanner largest = new Scanner(System.in);
		System.out.println("enter a:");
		int a = largest.nextInt();
		System.out.println("enter b:");
		int b = largest.nextInt();
		System.out.println("enter c: ");
		int c = largest.nextInt();
		if (a > b && a >c ) {
			System.out.println(" a is the largest");
				
		} else if (b>a && b>c) {
			System.out.println(" b is the largest");
		}else if (c>a && c>b) {
			System.out.println("c is the largest");
		}
	}

}
