//this is a keyword and is an implicit reference variable of current type and current
// and is available inside non-static method and constructor

package Thisclass;

public class demo2 {
	private String name;
	private int age;
	
	public demo2 (String name, int age) {//using this function with constructor
		this.name = name;
		this.age = age;
	
	}
	public void display() {
		System.out.println("name is:" +name);
		System.out.println("age is:" +age);
	
	}
	public static void main(String[] args) {
		
		//you cannot write this in static method
		//for example 
		//System.out.println(this.name);
		
	 demo2 obj2 = new demo2("shyam", 40);
	 
	 obj2.display();
	}
	

}
