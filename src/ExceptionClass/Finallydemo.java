package ExceptionClass;

import java.util.Scanner;

public class Finallydemo {

	public static void main(String[] args) {
		// finally always runs
		//we close all recourse close, resource shut down and clean up code 

		Scanner input = new Scanner (System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		try {
			System.out.println("try start");
		int result = divide (a,b);
		System.out.println("dividon is: " +result);
		System.out.println("try ends");
		} catch (ArithmeticException ae) {
			System.out.println("inside catch block");
		} finally {
			// finally always runs either in normal or in exception case.
		System.out.println("end of program..");
			// closing the resource code SCANNER from above 
		input.close();
		}
	}
	
	public static int divide (int a, int b) {
	return a/b;
	}
	
	

}
