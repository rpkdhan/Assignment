package Thisclass;

public class demo1 {
	
	// instance variable such as string and int.
	
	private String name;
	private int age;
	
	// when there is same local variable and instant variable to verify or distinguish we use this function.
	//for example
	public void assignValue (String name, int age) {//local variable inside bracket such as name and age.
		this.name = name;
		this.age = age;
		
	}
	// without using this function
	//public void assignValue (String n, int a) {//local varable inside bracket
		//name = n;
		//age = a;
	//}
	public void display() {
		System.out.println("name is:" +name);
		System.out.println("age is: " +age);
	}

	public static void main(String[] args) {
		demo1 obj1= new demo1();
		obj1.assignValue("ram", 2);
		
		obj1.display();
		

	}

}
