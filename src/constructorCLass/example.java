package constructorCLass;

import java.util.Scanner;

public class example {
	
	private String username;
	private String password;
	
	public example (String u, String p) {// we can make mutiple constructor in one class.
		username = u;
		password = p;
		System.out.println(" arg constructor called....");

	}
	
	//public example () { default constructor by Java Complier.
		//System.out.println(" default constructor called ....");
	//}
	public void display () {
		System.out.println("Username is: " + username);
		System.out.println(" Passwor is: " + password);
	}
	
	
}

