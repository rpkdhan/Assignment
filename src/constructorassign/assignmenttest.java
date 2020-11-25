package constructorassign;

public class assignmenttest {

	public static void main(String[] args) {
	assignment obj = new assignment();
	obj.setName("ram");
	obj.setNationality("Nepal");
	obj.setRoll(4);
	System.out.println(obj.getName());
	System.out.println(obj.getNationality());
	System.out.println(obj.getRoll());
	
	System.out.println("=================");
	
	assignment obj1 = new assignment();
	obj1.setName("Lakhan");
	obj1.setNationality("Nepal");
	obj1.setRoll(7);
	System.out.println(obj1.getName());
	System.out.println(obj1.getNationality());
	System.out.println(obj1.getRoll());
	

	}

}
