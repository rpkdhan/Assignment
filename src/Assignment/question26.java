package Assignment;

import java.util.Scanner;

public class question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter your number: ");
		int ori = input.nextInt();
		
		int rev = 0;
		 System.out.println("original number: " + ori);
		 while ( ori != 0) {
			 int temp = ori % 10;
			 rev = rev * 10 + temp;
			 ori = ori / 10; 
			 
		 }
		 System.out.println("your reversed number is: " +rev);
		 input.close();
		
	}

}
