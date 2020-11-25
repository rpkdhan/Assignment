package PolymorfinClass;

import java.util.Scanner;

public class test {
	
	public static void getAnimalBehavior(Animal animal) {
	animal.makeSound();
}
	public static void main(String[] args) {
		Animal animal = null;
		Scanner input = new Scanner(System.in);
		System.out.println("which animal voice you want to hear?");
		String choice = input.next();
		
		switch (choice) {
		case "dog": 
			animal = new dog();
			break;
		case "tiger":
			animal = new tiger();
			break;
		
		default:
			System.out.println("Wrong Choice..");
			break;
		 
	}
		if (animal!=null) {
			test.getAnimalBehavior(animal);
		}
	}
}
