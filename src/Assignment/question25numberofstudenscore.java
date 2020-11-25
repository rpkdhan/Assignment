package Assignment;

import java.util.Scanner;

public class question25numberofstudenscore {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(" enter number of student: ");
		int numofstudent = input.nextInt();
		
		int maxScore = 0;
		String studentName = "";
		
		for (int i =1; i <= numofstudent; i++) {
			System.out.println("enter name of student :");
			String name = input.next();
			System.out.println("Enter score of student:");
			int score = input.nextInt();
			if (score > maxScore) {
				maxScore = score;
				studentName = name;
			}
		}
			System.out.println("Student Name is: "+studentName);
			System.out.println("Max score is: "+maxScore);
			input.close();
	}

}
