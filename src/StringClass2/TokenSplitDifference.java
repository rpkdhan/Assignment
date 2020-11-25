package StringClass2;

import java.util.StringTokenizer;

// only difference between these two split and tokenizer is tokenizer reduce unwanted object
// as in below example comma ","

public class TokenSplitDifference {

	public static void main(String[] args) {
		
		String Lines = "Hello,, My name is Rupak Pradhan,, I am planning to work as a Java Developer,, I am currently residing in USA";
		String [] words = Lines.split(",");
		System.out.println(words.length);
		for(String w: words) {
			System.out.println(w);
		}
		
		System.out.println("============");
		StringTokenizer st = new StringTokenizer(Lines, ",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
	
}
