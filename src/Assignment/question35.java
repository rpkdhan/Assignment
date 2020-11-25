package Assignment;

import java.util.Scanner;

public class question35 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter size of an array: ");
		int size = input.nextInt();
		
		int []arr = new int[size];
		for ( int i=0; i < arr.length; i++) {
			System.out.println(" enter your element: ");
			arr[i] = input.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(" second largest element is: " +arr[size-1]);
		

	}

}
