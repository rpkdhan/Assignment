package StringClass2;

public class demo1 {
	
	public static void main(String[] args) {
		String s1 = "Good Evening";
		System.out.println(s1);
		System.out.println(s1.substring(5)); // to just take "Evening" part.
		System.out.println(s1.substring(0, 4)); // just to take a part of word.
		System.out.println(s1.toUpperCase()); // to take into uppercase
		System.out.println(s1.toLowerCase()); // convert into lowercase
		System.out.println(s1.indexOf('d')); // to know index of the word
		System.out.println(s1.charAt(5)); // to know character of index
		char [] ch = s1.toCharArray();//to convert or manipulate into array
		System.out.println(ch[5]);
		System.out.println(s1.contains("Good")); // show the phrase is there or not
		System.out.println(s1.contains("Bad")); // false will be answer
		System.out.println(s1.contains("z"));
		System.out.println(s1.replace("ood", "bad"));// to replace the word
		System.out.println(s1.replace("G", "M"));
		System.out.println(s1.concat("Hello")); // to add something in your string.
		System.out.println("Hello," .concat(s1)); // to add infront of your string.
		
		String s2 = " Rupak Pradhan ";
		System.out.println(s2);
		System.out.println(s2.trim()); // to eliminate space infront and last of the string 
		
		byte [] bb = s1.getBytes(); // to get into bites
		System.out.println(bb.toString());
		
		System.out.println(s1.length());// to show the length
	}

}
