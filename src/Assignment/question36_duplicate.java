package Assignment;

import java.util.Scanner;

public class question36_duplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter the size of an array: ");
		int size = input.nextInt();
		
		int []arr = new int[size];
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j < arr.length; j++) {
				System.out.println(" please enter your element: ");
				arr[i]= input.nextInt();
			}
		}
		System.out.print("Duplicate element: ");
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr [i] == arr [j]) {
					System.out.print(arr[j]+" ");
					a++;
				}
			}
		}
		if (a ==0) {
		System.out.println(" No duplicate element is found.");
		}
		

	}

}
