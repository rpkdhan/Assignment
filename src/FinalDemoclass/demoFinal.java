package FinalDemoclass;

//1. we cannot inherit(extend)final class

public /*final*/ class demoFinal {
	
	// 3. if we use final on variable, then it becomes constant or fixed.
	final int a = 5;
	
	//2. we cannot override Final method
	public /*final*/ void greet() {
		System.out.println("hello, good morning....");
	}
	
	//4. we cannot use final keywords on constructor
	
	public /*final*/ demoFinal() {
		
	}

}
