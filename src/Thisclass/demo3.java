package Thisclass;

public class demo3 {
	
	//instance variable
	int a = 5;
	
	// this is an assignment variable so we must put it in front.
	
	public void show() {
		System.out.println(a);// will give 5 as a result
		int a= 6;
		System.out.println(a);// will give 6 as a result because it shadow instance variable which is 5.
		System.out.println(this.a);//this will print 5 as a result becasue we use this function
		int s = a + this.a;
		System.out.println("sum is:" +s);
		
	
	}
	public static void main(String[] args) {
		demo3 obj1 = new demo3();
		obj1.show();
		
	}

}
