package Arrayclass;

import java.util.Scanner;

public class arraydemo2 {

	public static void main(String[] args) {
		// when you want to ask array from user.
		Scanner input = new Scanner (System.in);
		System.out.println("enter size of an array: ");
		int size = input.nextInt();
		
		//to take input elemetn in an array
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter element: ");
			arr[i] = input.nextInt();
		}
		// t0 print an element of an array
				for (int i= 0; i<arr.length; i++) {
					System.out.println(arr[i]);
	
			
			// to print sum of the element
			int sum =0;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				sum = sum + arr[i];
			}
			System.out.println("the sum of the array is: " +sum);
			
		}
	}

}
