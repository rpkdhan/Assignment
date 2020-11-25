package StringClass2;

 	// String Buffer and String Builder are same but the only difference is
	// String Buffer has Synchronized ifront of it whereas String Builder doesn't.

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Good");
		System.out.println(sb);
		sb.append(" Morning"); // "append" is used as "concet" in string.
		System.out.println(sb); // you don't have to make new string in this class.
		
		sb.insert(0, "Hello, "); // to insert value of string
		System.out.println(sb);
		
		sb.reverse(); // reverse whole word
		System.out.println(sb);
		

	}

}
