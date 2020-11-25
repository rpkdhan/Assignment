package Assignment;

import java.util.Scanner;

public class poundintokg {

	public static void main(String[] args) {
		Scanner pkg=new Scanner (System.in);
		System.out.println("enter Pound: ");
		double Pound = pkg.nextDouble();
		double Kg= Pound * 0.454;
		System.out.println("the value of kg: " +Kg);
		System.out.println("since 1 pound is 0.454kg");
	}

}
