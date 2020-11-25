package Assignment1;

public class dublicateLetter {

	public static void main(String[] args) {
		String sentence = "How many duplicates are there?";
		System.out.println(sentence);
			
		
		String characters = "";
		String duplicate = "";
		for (int i =0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				if (!duplicate.contains(current)) {
					duplicate += current + ",";
					
					
				}
			}
			characters += current;
		}
System.out.println(duplicate);
	}

}
