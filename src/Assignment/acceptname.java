package Assignment;

import java.util.Scanner;

public class acceptname {

	public static void main(String[] args) {
		Scanner accept = new Scanner (System.in);
		System.out.println("enter your name: ");
		String name = accept.nextLine();
		System.out.println("enter your nationality: ");
		String nationality = accept.next();
		System.out.println(" enter your age: ");
		int age = accept.nextInt();
		
		System.out.println();
		System.out.println("name  : " +name);
		System.out.println("nationaltiy  : " +nationality);
		System.out.println("age  : " +age);
		
		

	}

}
