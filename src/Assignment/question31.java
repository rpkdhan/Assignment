package Assignment;

import java.util.Scanner;

public class question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter number: ");
		int n = input.nextInt();
		
		for (int i=0; i<=n; i++) {
			for (int j=1; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
			
	}

}
