package Assignment;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		Scanner convert = new Scanner (System.in);
		System.out.println("enter fahrenheit: ");
		double f = convert.nextDouble();
		double celsius= (f-32)*5/9;
		System.out.println("celsius is: " +celsius);
		
		

	}

}
