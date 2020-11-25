package InheritanceClass2;

public class sub extends Super {
	
	//if you assign any variable in class than variable on parents will be hidden.
	
	// for example
	//known as hiding variable
	String name = "Child is also called Sub..";// here it will hide variable on  parents method and print in inheritancetest class.
	
	//overriding method
	public void greet() {
		System.out.println(" Child is Sub");// same reason as above 
	}
}
