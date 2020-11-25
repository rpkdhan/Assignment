package Assignment;

import java.util.Scanner;

public class question17leapyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		if (year % 4 == 0 && year % 100 !=0) {
			System.out.println(year + " Is a leap year");
		} else if (year % 400 ==0) {
			System.out.println(year + " Is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
