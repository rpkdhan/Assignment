package Assignment;

import java.util.Scanner;

public class math2 {

	public static void main(String[] args) {
		Scanner math2 = new Scanner(System.in);
		System.out.println("enter a: ");
		double a = math2.nextDouble();
		System.out.println("enter b: ");
		double b = math2.nextDouble();
		System.out.println("enter c: ");
		double c = math2.nextDouble();
		
		double s = (a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area is: " +area);
		
		
		
		
		
		

	}

}
