package AssignmentException43;

import java.util.Scanner;

public class TrapforDivisionZERO {

	public static void main(String[] args) {
		
			
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
			}
			System.out.println("end of program..");
		}
		
		public static int divide (int a, int b) {
		return a/b;
		}
	

	}


