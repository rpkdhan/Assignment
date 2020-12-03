package AssignmentException43;

import java.util.Arrays;
import java.util.Scanner;

public class IdexValueException {

	private static long[] myArray;

	public static void main(String[] args) {
		int [] ar = {5, 10 ,15, 16, 299, 300, 399};
		System.out.println(" Elements in the array are: ");
		System.out.println(Arrays.toString(ar));
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the index of the required elements :");
		
		try {
			int element = input.nextInt();
			System.out.println("Elements in the given index is :" +ar[element]);
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("The index you have entered is invalid");
			System.out.println("Please enter an index number between 0 and 6");
		}

	}

}
