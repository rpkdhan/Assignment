package Assignment;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = Math.PI;
		System.out.println("enter the value of radius: ");
		double radius =input.nextDouble();
		double areaofcircle = PI*Math.pow(radius, 2);
		System.out.println("area of ciricle is:" + areaofcircle);
		input.close();
		

	
		
		
		
		

	}

}
