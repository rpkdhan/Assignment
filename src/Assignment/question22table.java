package Assignment;

import java.util.Scanner;

public class question22table {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter your number:" );
		int n = input.nextInt();
		int t = 0;
		for (int i = 1; i <= 10; i++) {
			t = n*i;
			System.out.println(n + "*" +i +"=" +t);
		}
	
	}

}
