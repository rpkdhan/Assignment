package StringClass;

public class demo2 {

	public static void main(String[] args) {
		
		String s1 = "Nepal";
		String s2 = "Nepal";
		
		String s3 = new String ("Nepal");
		String s4 = new String ("Nepal");
		String s5 = new String ("nepal");
		
		//comparing multiple String
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s2 == s4);//false
		System.out.println(s3 == s4);//false
		
		//if you want to compare, this is a correct way to do
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		
		//when there is difference in lower case and upper case to compare we need
		
		System.out.println(s1.equalsIgnoreCase(s5));
		

	}

}
