package InheritanceClass1;

public class InheritanceTest {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		System.out.println(obj1.name);
		obj1.sayHello();
		
		// example using extend for Child class. where every features of parents extended to child.
		Child obj2 = new Child();
		System.out.println(obj2.name);
		obj2.sayHello();
		
		

	}

}
