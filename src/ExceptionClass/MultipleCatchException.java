package ExceptionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

// we can put as much catch block in one try block
// also called multi level catch block

public class MultipleCatchException {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int [] arr = new int [2];
		
		try{
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		arr[2] = divide(a,b);
		
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}catch (InputMismatchException ie) {
			System.out.println(ie);
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
