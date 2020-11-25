package costructorSetandGet;

import java.beans.Statement;

public class studenttest {

	
	public static void main(String[] args) {
		student obj = new student();
		obj.name = "Ram"; // set the name from previous student.java file
		obj.roll=20; //set the value from previous student.java file
		System.out.println(obj.name);// get the value from student.java file
		System.out.println(obj.roll);// same here
		
		System.out.println("===============");// when we try to put more than one value
		student obj1 = new student();
		obj1.name = " Hari "; // same as above.
		obj1.roll = 25;// same as above
		System.out.println(obj1.name);
		System.out.println(obj1.roll);
		
		
		
		
		
	}

}
