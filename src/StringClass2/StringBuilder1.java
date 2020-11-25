package StringClass2;
 
	// String Builder is used as a mutable object.

public class StringBuilder1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" Morning"); // "append" is used as "concet" in string.
		System.out.println(sb); // you don't have to make new string in this class.
		
		sb.insert(0, "Hello, "); // to insert value of string
		System.out.println(sb);
		
		sb.reverse(); // reverse whole word
		System.out.println(sb);
		
		
		
		
		
		
		

	}

}
