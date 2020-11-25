package Assignment;

import java.util.Scanner;

public class math1 {

	public static void main(String[] args) {
		Scanner math1 = new Scanner(System.in);
		System.out.println("enter u: ");
		double u = math1.nextDouble();
		System.out.println("enter a: ");
		double a = math1.nextDouble();
		System.out.println("enter t: ");
		double t = math1.nextDouble();
		double s = (u*t)+ (0.5*a*Math.pow(t, 2));
		System.out.println("the value of s: " +s);
		

	}

}
