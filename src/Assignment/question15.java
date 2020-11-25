package Assignment;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the number: ");
		int n = input.nextInt();
		
		if (n>=0 && n<=128) {
			char c = (char) n;
			System.out.println("corresponding ASCII cose is: " +c);
		}else {
			System.out.println("you have entered invalid number2");
		}

	}

}
