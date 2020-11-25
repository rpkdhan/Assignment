package Assignment;

import java.util.Scanner;

public class question19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" enter side a: ");
		int a = input.nextInt();
		System.out.println("enter side b: ");
		int b = input.nextInt();
		System.out.println("enter side c: ");
		int c = input.nextInt();
		
		if ((a + b<c)||(a+c<b)||(b+c<a)){
			System.out.println("it is not a valid triangle");
		}else if (a==b && a==c) {
			System.out.println("it is equalateral triangle");
		}else if (a==b || a==c || b==c) {
			System.out.println("it is isoceles triangle");
		}else {
			System.out.println("it is scalene triangle");
		}
	}

}
