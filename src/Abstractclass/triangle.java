package Abstractclass;


public class triangle extends abstractDemo {
	
	// if we are extending abstract class then we must override it on child class

	public void draw () { // here we use *public* to override abstract from parent abstractDemo class 
		System.out.println(" triangle is drawn..");
	}
	
	// calling constructor from parent class
	
	public triangle() {
		System.out.println("traingle constructor...");
	}
	

}
