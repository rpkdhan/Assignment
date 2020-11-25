package StringClass2;

public class demo2Immutable {

	public static void main(String[] args) {
		String s1 = "Good";
		System.out.println(s1);
		s1.concat("Morning"); // due to feature of String i.e. "an immutable class", once we make a object we cannot change in same variable.
		System.out.println(s1); // to change we have to make new string or make same one as follow
		
		s1 = s1.concat(" Morning");
		System.out.println(s1);
		// or with new string
		String s2 = "Hello, ".concat(s1);
		System.out.println(s2);

	}

}
