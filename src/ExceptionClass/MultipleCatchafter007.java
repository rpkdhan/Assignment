package ExceptionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchafter007 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		int [] arr = new int [2];
		
		try{
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		arr[2] = divide(a,b);
		// you can use it as given below to catch exception
		} catch (ArithmeticException | InputMismatchException ae) {
			System.out.println(ae);
			// you can use only exception e to catch exception expect to gives particular info.
		} catch (Exception e) {
			// exception is parent to all exception so it must comes at last
			System.out.println(e);
		} finally {
			// finally always runs either in normal or in exception case.
		System.out.println("end of program..");
			// closing the resource code SCANNER from above 
		input.close();
		}
	}
	
	public static int divide (int a, int b) {
	return a/b;
	}
}
