package InheritanceClass2;


// in inheritance we cannot inherit following function
//1. private member
//2. hidden variable
//3. overridden method

//parent=super=Base
//child=sub=Derived

public class Super {
	
	//if we use private infront of variable than we cannot extend it to child class.
	/*private*/ String name = "Parent is super..";//hidden variable
	
	
	//overridden method
	
	// we cannot override three function suchas 1. private method, 2. static class 3.final method
	
	public void greet() {
		System.out.println("Parent is also called Super...");
	}
	

}
	