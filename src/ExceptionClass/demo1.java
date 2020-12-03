package ExceptionClass;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// Exception are the error occurs in run time process.
		// which means whenever there occurs error while users trying to input data then it is called Exception.
		// for example
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int div = a/b;
		System.out.println("division of a and b is: " +div);
		
		// in above case if user assign '0' as b then it will gives us error of exception because any value divide by '0' is a error in java.
		// so, code is fine above but while in run time user provides wrong info then, exception occur.
		}

}
