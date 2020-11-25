package Abstractclass;

public class exampleAbstract {

	public static void main(String[] args) {
		
		// we cannot create an object of abstract class
	// for example -	abstractDemo *abstractDemo* = new abstractDemo();
		
		// but we can create any number of reference variable
		
		// for example - 
		abstractDemo abstractDemo = new triangle();
		abstractDemo.draw();
		
		abstractDemo = new circle();
		abstractDemo.draw();
		
		
	}

}
