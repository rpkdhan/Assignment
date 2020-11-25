package Assignment;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner swap = new Scanner (System.in);
		System.out.println("enter a: ");
		int a = swap.nextInt();
		System.out.println("enter b: ");
		int b = swap.nextInt();
		System.out.println("before swapping a is:" +a);
		System.out.println("before swapping b is: " +b);
		//with using variable
		int c = a;
		a=b;
		b=c;
		
		System.out.println();
		System.out.println("after swapping a is: " +a);
		System.out.println("after swapping b is: " +b);
 
		
		// without using variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println();
		System.out.println("after swapping a is: " +a);
		System.out.println("after swapping b is: " +b);
	}

}
