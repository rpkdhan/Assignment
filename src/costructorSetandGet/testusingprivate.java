package costructorSetandGet;

public class testusingprivate {

	public static void main(String[] args) {
		usingprivate obj = new usingprivate();
		obj.setName ("ram");
		obj.setRoll(20);
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
		
		
		System.out.println("===============");
		
		usingprivate obj1 = new usingprivate();
		obj1.setName("Hari");
		obj1.setRoll(30);
		System.out.println(obj1.getName());
		System.out.println(obj1.getRoll());
	}

}
