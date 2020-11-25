package StringClass2;

public class SplitDemo {

	public static void main(String[] args) {
		
		String Lines = "Hello, My name is Rupak Pradhan, I am planning to work as a Java Developer, I am currently residing in USA";
		String [] words = Lines.split(" ");
		for(String w: words) {
			System.out.println(w);
		}
		
		System.out.println("=============");
		words = Lines.split(",");
		for(String w: words) {
			System.out.println(w.trim());
		}
				
		

	}

}
