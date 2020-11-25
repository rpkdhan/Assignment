package PolymorfinClass;

//  Run time Polymorfine dynamic class.

import java.util.Scanner;

public class accounttest {
	
	public static void open (demoAC account) {
		account.openAccount();
	}

	public static void main(String[] args) {
		demoAC account = null;
		Scanner input = new Scanner(System.in);
		System.out.println("which account you want to open?");
		String choice = input.next();
		
		switch (choice) {
		case "Saving": 
			account = new demoSA();
			break;
		case "Current":
			account = new demoCA();
			break;
		default:
			System.out.println(" Wrong Choice..");
			break;
		}
		
		if (account!=null) {
			accounttest.open(account);
		}
		

	}

}
