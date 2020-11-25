package Assignment;

import java.util.Scanner;

public class question32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter size of an array: ");
		int size = input.nextInt();
		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter your number: ");
			arr [i] = input.nextInt();
		}
			 int sum = 0;
			 for (int i = 0; i < arr.length; i++ ) {
				 System.out.println(arr[i]);
				 sum = sum + arr [i];
		}
System.out.println(" the sum of an array is : " + sum);
	}

}
