package Assignment;

import java.util.Scanner;

public class question34 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter size of an array: ");
		int size = input.nextInt();
		
		 int[]arr = new int[size];
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println("enter an element: ");
			 arr[i] = input.nextInt();
		 }
		 System.out.println(" original order is: ");
		 for ( int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
		 System.out.println("Reverse order is: ");
		 for (int i = (arr.length-1); i >=0; i--) {
			 System.out.println(arr[i] + " ");
		 }
		
	}	 
	
	
	}
