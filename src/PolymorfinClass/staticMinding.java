package PolymorfinClass;

// We can write same method with different argument shown as in below.

public class staticMinding {
	
	//example of overloaded method.
	
	public void sum () {
		int a = 3;
		int b = 4;
		int add = a+b;
		System.out.println("sum is: "+add);
		
	}
	public int sum (int a, int b) {	// example of return type.
		int add = a+b;
		System.out.println("sum is: "+add);
		return add;
	}
	
	public void sum (double a, int b) {	
		int add = (int)a+b;
		System.out.println("sum is: "+add);
		
	}
	public void sum (int a,double b) {	
		int add = a+ (int)b;
		System.out.println("sum is: "+add);
		
	}
	public void sum (double a, double b) {	
		double add = a+b;
		System.out.println("sum is: "+add);
		
	}
	// here compltime polymorfine can be achived since we already now the answer.
	// it can achieved through overloading of method.
	
	public static void main(String[] args) {
		staticMinding cal = new staticMinding();
		cal.sum(1,3);
	}
	

}
