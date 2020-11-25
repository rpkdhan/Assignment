package Abstractclass;

// to make abstract class we have to put *abstract before class.
// we cannot use *final* infront of abstract class

		public /*final*/ abstract class abstractDemo {
	
	// to make abstract method we have to put abstract before method but not body.
			
			abstract /*public*/ void draw();// bodyless
	
	// we can create another body class for example
	// you wont need to override this class.
			
			public void paint() {
				System.out.println("shape is drawn");
	}
	
	// we call constructor on this class too
			
			public abstractDemo() {
				System.out.println(" it's constructor");
				
			}
	

}
