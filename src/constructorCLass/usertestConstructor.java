package constructorCLass;

import java.util.Scanner;

public class usertestConstructor {

	public static void main(String[] args) {//if you want to put your own name.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input.next();
		System.out.println("Enter password: ");
		String password = input.next();
		example obj1 = new example (username, password);
		obj1.display();

	
		example obj2 = new example("pppp", "lllll");// if it is fixed object.
		obj2.display();
	}
		

}
