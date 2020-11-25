package ProjectAssignment;

import java.util.Scanner;

public class PradhanTakeOut {

	public static void main(String[] args) {
		// Getting input from user.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("How many people do you have?");
		int numberOfPeople = sc.nextInt();
		
		boolean isMenuChoice=false;
		
		if(numberOfPeople < 10 || numberOfPeople > 100) {
			System.out.println("Invalid Number of People..");
			System.exit(0);
			
		}
		
		do {
			// Staring to order food.
			
			System.out.println("MENU");
			PradhanTakeOut.displayMainMenu();
			
			System.out.println("What Kind of Food Would You Like to Order?");
			String mealType = sc.next();
			
		switch (mealType) {
		case "1": 
			PradhanTakeOut.displayMainMenu();
			int [] feedItalianFood = {5,7,4};
			double [] priceI = {17.99, 15.99, 12.99};
			int opt = PradhanTakeOut.foodChoice(feedItalianFood,priceI);
			PradhanTakeOut.finalPrice(feedItalianFood, priceI, opt, numberOfPeople);
			isMenuChoice = false;
			break;
		case "2":
			PradhanTakeOut.displayMainMenu();
			int [] feedChineseFood = {7,7,5};
			double []priceC = {18.99, 18.99, 10.99};
			int opt1 = PradhanTakeOut.foodChoice(feedChineseFood, priceC);
			PradhanTakeOut.finalPrice(feedChineseFood, priceC, opt1, numberOfPeople);
			isMenuChoice = false;
			break;
		case "3":
			PradhanTakeOut.displayMainMenu();
			int[]feedAmericanFood = {8,5,10};
			double[]priceA = {21.99, 22.99, 26.99};
			int opt2 = PradhanTakeOut.foodChoice(feedAmericanFood, priceA);
			PradhanTakeOut.finalPrice(feedAmericanFood, priceA, opt2, numberOfPeople);
			isMenuChoice = false;
			break;
			
		
		default:
			System.out.println("Wrong Choicee....");
			isMenuChoice = true;
			break;
			}
	
		} while (isMenuChoice);
	}
			

	public static void displayMainMenu() {
		String []foodMenu = {"Italian", "Chinese", "American"};
		System.out.println("---------------");
		for (int i=0; i < foodMenu.length; i++) {
			System.out.println((i+1) + "." + foodMenu[i]);
		}
				
	}
	public static void displayItalainaFoodMenu() {
		String[] italianFood = {"Lasagna Tray", "Pizza Pack","Gazpacho Soup, salad and bread Sticks pack "};
		System.out.println("----------------");
		for (int i = 0; i < italianFood.length; i++) {
			System.out.println((i+1) + "." + italianFood[i]);
			
		}
	}
	public static void displayChineseFoodMenu() {
		String[] chineseFood = {"Chicken and Broccoli Tray (including 7 wonton soups, 7 egg rolls)", "Sweet and Sour Pork Tray (includes 7 hot and sour soup, 7 egg rolls)","Shrimp Fried Rice Tray (includes 10 egg rolls"};
		System.out.println("----------------");
		for (int i = 0; i < chineseFood.length; i++) {
			System.out.println((i+1) + "." + chineseFood[i]);
		}
	}
	public static void displayAmericanFoodMenu() {
		String[] americanFood = {"Hamburger and Hot Dog Tray - includes buns and condiments", "Grilled Chicken Sandwich and Mozzarella Sticks Tray - include dipping sauces","Barbeque Tray - includes buns and peach cobbler"};
		System.out.println("----------------");
		for (int i = 0; i < americanFood.length; i++) {
			System.out.println((i+1) + "." + americanFood[i]);
		}
	}
	public static int determineTray (int people, int feeds) {
		int trays = (int) (Math.round(people/feeds + 0.5));
		return trays;
	}
	public static double getSubtotal (double price, int trays) {
		double subTotal = (trays*price);
		return subTotal;
	}
	public static double getTip (double subTotal, double tipRate) {
		double tip = subTotal * tipRate;
		return tip;
	}
	public static double getTax (double subTotal, double taxRate) {
		double tax = subTotal * taxRate;
		return tax;
	}
	public static double getGrandTotal (double subTotal, double tax, double tip) {
		double total = subTotal + tax + tip;
		return total;
	}
	public static double pricePerPerson (double grandTotal, int people) {
		return grandTotal / people;
	}
	public static int determinLeftOvers (int feeds, int trays, int people) {
		return ((trays*feeds)-people);
	}
	
	
	
		// Display food Trays Menu
	
	public static int foodChoice (int[] feed, double[] prices) {
		Scanner sc = new Scanner (System.in);
		System.out.println("CHOOSE ONE");
		System.out.println("-----------");
		for (int i = 0; i < feed.length; i++) {
			System.out.println((i + 1) + "- feeds " + feed[i] + " - " + prices[i]);
		}
		
		System.out.println("Enter Your Choice");
		int opt = sc.nextInt();
		if (opt <= 0 || opt > feed.length) {
			System.exit(0);	
		}
		return opt;
	}
	public static void finalPrice (int[] feeds, double[] prices, int choice, int guestCount) {
		int trays = PradhanTakeOut.determineTray(guestCount, feeds[choice-1]);
		double subTotal = PradhanTakeOut.getSubtotal (prices[choice-1], trays);
		double tax = PradhanTakeOut.getTax(subTotal, .07);
		double tip = PradhanTakeOut.getTip(subTotal, 0.15);
		double grandTotal = PradhanTakeOut.getGrandTotal(subTotal, tax, tip);
		System.out.println("you need" + trays + "trays");
		System.out.println("Feed:" + feeds[choice - 1]);
		System.out.printf("Price for " + guestCount + "people (" + trays + " trays): $%.2f\n", subTotal );
		System.out.printf("Tax : $%.2f\n", tax);
		System.out.printf("Tip : $%.2f\n", tip);
		System.out.printf("Total ( Food, Tax, Tip) : $%.2f\n", grandTotal);
		System.out.printf("Price per person : $%.2f\n", PradhanTakeOut.pricePerPerson(grandTotal, guestCount));
		System.out.printf("Left- Over serving for the delivery person :" + PradhanTakeOut.determinLeftOvers(feeds[choice-1], trays, guestCount));		
	}
	 
	

}
