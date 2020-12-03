package AssignmentString;

import java.util.Scanner;

public class dupWord {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the string!!");
		String s = input.nextLine();
		int count;
		s = s.toLowerCase();
		String words[]=s.split(" ");
		System.out.println("The dublicate words in the string are: ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i+1; j<words.length; j++) {
				if(words[i].contentEquals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if (count>1 && words[i]!="0")
				System.out.println(words[i] + ",");
		}
			
		input.close();


	}

}
