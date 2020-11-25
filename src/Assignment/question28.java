package Assignment;

import java.util.Scanner;

public class question28 {

	public boolean isPrimeNumber(int n) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter number to find prime: ");
		int prime = input.nextInt();
		
		
			boolean isPrime = true;
			for (int i = 2; i<=n/2; i++) {
				if (n%i==0) {
					isPrime = false;
				}
				return isPrime;
			}
				
				if (isPrime) {
					System.out.println(n +" is a prime number.");
				}else {
						System.out.println(n+" is not a prime number");
					}
				return isPrime;
				}

	}


