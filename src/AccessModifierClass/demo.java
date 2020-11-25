package AccessModifierClass;

public class demo {
	
	String defaultVar = " this is default variable";
	public String publicVar = "this is public varible";
	private String privateVar = " this is private variable";
	protected String protectedVar = " this is protected variable";
	
	void defaultMethod() {
		System.out.println(" this is default method...");
	}
	public void publicMethod() {
		System.out.println("this is public method...");
	}
	private void privateMethod() {
		System.out.println("this is private method...");
	
}
	protected void protectedMethod() {
		System.out.println("this is protected method...");
	}
	public demo (){
		System.out.println("this is public level access constructor");
		
	}
	demo(int a){
		System.out.println("this is default level access constructor");
	}
	private demo (double a ){
		System.out.println(" this is private level access constructor");
	}
	protected demo (String a) {
		System.out.println(" this is protected level access constructor");
	}
	public static void main(String[] args) {
		demo obj = new demo(5);
		obj.defaultMethod();
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
	}
	
}
