package AssignmentString;


public class reverseString {

	public static void main(String[] args) {
		
	String s = reverse ("Hi, I am Rupak!!!");
	System.out.println(s);
	}
	
	public static String reverse (String r) {
		char [] letters = new char[r.length()];
		
		int letter = 0;
		for (int i =r.length()-1; i>=0; i--) {
			letters [letter] = r.charAt(i);
			letter++;
		}
		String reverse = "";
		for (int i = 0; i < r.length(); i++) {
			reverse = reverse + letters[i];
		}
		return reverse;
	}
}
