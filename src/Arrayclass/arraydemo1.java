package Arrayclass;

public class arraydemo1 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2= 4;
		int n3 = 6;
		int sum = n1 + n2 + n3;
		System.out.println("print sum : "+ sum);

		// array : is a group of same data type of elements
		// Arranged in a sequential manner
		
		int [] arr = new int[3];// array declaration and initialization.
		int [] arr;// array declaration and initialization.to ways to initialized value in array.
		arr = new int[3]// array declaration and initialization.
		
		System.out.println(arr); // gives object id
		
		System.out.println(arr.length); // size of an array
		
		
		// prints default value.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//if you want to put value than its described below.
arr[0]= 34;
arr [1]= 10;// this will assign value in array.
arr[2]= 23;
	
// and if you want to print it use below method.
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
	}

}
