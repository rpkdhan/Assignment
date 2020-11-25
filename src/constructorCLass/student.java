package constructorCLass;

public class student {
	// constructor: is a special method which has following properties:
	
	
	//1. It's name is same as class name
	//2. It has no return type
	//3. we can not even use 'void' keyword
	//4. It can have any access modifier
	//5. It is  mainly used to initialize member's data.
	//6. It runs only once for each object.
	
	// for example.
	
	private String name;
	private int roll;
	
	public void assignValue (String n, int r) {
		name = n;
		roll = r;
	}
		
	public student (String n, int r) {// same name as class and no use of void
		name = n;
		roll = r;
		System.out.println("constructor called");
		
	}
	public void displayInfo() {
		System.out.println("Name is : " +name);
		System.out.println(" Roll is : " + roll);
		
	}
	public static void main(String[] args) {
		student obj1 = new student("Ram", 32);// It calls only one time.you cannot call it again with same name.
		obj1.displayInfo();
		
		System.out.println("==============");
		student obj2 = new student ("Shyam", 20);//. if you want to call you have to make new object. here we assign obj2.
		obj2.displayInfo();
	}

}
