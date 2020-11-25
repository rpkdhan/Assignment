package InheritanceClass2;

public class Derived extends Base {
	
	//compiler provide constructor itself
	
	public Derived () {
		super(5);// this is auto generated argument and cannot be called later 
		System.out.println(" child's ulala");
		
	}
	
	public Derived (int a) {
		System.out.println("default child constructor");
	}
	String name = "child name";
	
	public void greet () {
		System.out.println(name);
		System.out.println(super.name);// use of 'super' is same as 'this' that means to bring parent information too.
		System.out.println("hi good morning");
		super.greet();
	}
	

}
