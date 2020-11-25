package Assignment;

import java.util.Scanner;

public class perimeterofcircle {

	public static void main(String[] args) {
		Scanner peri= new Scanner(System.in);
		System.out.println("enter radius: ");
		double r = peri.nextDouble();
		final double  PI = Math.PI;
		double pericircle = 2*PI*r;
		System.out.println("Perimeter of circle is:" +pericircle);
		
		

	}

}
