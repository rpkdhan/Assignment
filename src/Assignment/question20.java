package Assignment;

import java.util.Scanner;

public class question20 {

	public static void main(String[] args) {
		// answer of 20
		Scanner input = new Scanner(System.in);
		System.out.println("enter your choice : + - / *");
		int a = 0, b = 0, c = 0;
		char choice = input.next().charAt(0);
		
		if (choice == '+' || choice == '-' || choice == '*' || choice == '/') {
			System.out.println("enter number1: ");
			a=input.nextInt();
			System.out.println("enter number2: ");
			b=input.nextInt();
		}
		switch (choice) {
		case '+':
		c = a + b;
		System.out.println("sum is : " +c);
		break;
		case '-':
		c= a-b;
		System.out.println("substraction is:" +c);
		break;
		case '*':
			c= a*b;
			System.out.println("mutiplication is :" +c);
			break;
		case '/':
			c=a*b;
			System.out.println("division is:" +c);
			break;
			default:
				System.out.println("invalid word");
			break;
			
		
		}

	}

}
