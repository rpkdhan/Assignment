package Assignment;

import java.util.Scanner;

public class volumeofcylinder {

	public static void main(String[] args) {
		Scanner volume = new Scanner(System.in);
		System.out.println("enter the radius: ");
		double r = volume.nextDouble();
		System.out.println("enter the height: ");
		double h = volume.nextDouble();
		final double PI= Math.PI;
		double volc= PI*Math.pow(r, 2)*h;
		System.out.println("volume of cylinder:" +volc);
		

	}

}
