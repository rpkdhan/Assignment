package Assignment;

import java.util.Scanner;

public class perimeteroftriangle {

	public static void main(String[] args) {
		Scanner ptri = new Scanner(System.in);
		System.out.println("enter value of side: ");
		double s= ptri.nextDouble();
		System.out.println("enter value of base: ");
		double b = ptri.nextDouble();
		System.out.println("enter value of next side: ");
		double s1=ptri.nextDouble();
		double peritri= s+b+s1;
		System.out.println("perimeter of triangle:" +peritri);
		

	}

}
