package Assignment;

import java.util.Scanner;

public class question33 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter the size of an array: ");
		int size = input.nextInt();
		int []arr = new int [size];
		
		int temp = 0;
		
		System.out.println(" enter the user's choice of elements: ");
		for ( int i= 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for ( int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
				}
				
			}
		}
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i] + "");
}
	}

}
