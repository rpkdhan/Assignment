package Assignment;

import java.util.Scanner;

public class math3 {

	public static void main(String[] args) {
		Scanner math3 = new Scanner (System.in);
		System.out.println("enter b: ");
		double b = math3.nextDouble();
		System.out.println("enter a: ");
		double a = math3.nextDouble();
		System.out.println("enter c: ");
		double c = math3.nextDouble();
		
		double x = (-b + (Math.sqrt(Math.pow(b, 2)-4*a*c)))/2 * a;
		
		System.out.println("value of x : " + x);
		
		

	}

}
