package StringClass2;

import java.util.StringTokenizer;

public class StringTokennizerDemo {
	
	//String Tokenizer is same as String Split
	// the only difference between them is String Tokenizer eliminate unwanted things.

	public static void main(String[] args) {
		
		String Lines = "Hello, My name is Rupak Pradhan, I am planning to work as a Java Developer, I am currently residing in USA";
		StringTokenizer st = new StringTokenizer(Lines);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("==========");
		 st = new StringTokenizer(Lines, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

	}

}
