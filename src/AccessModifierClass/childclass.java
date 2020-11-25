package AccessModifierClass;

public class childclass {
	public static void main(String[] args) {
		demo obj = new demo(5);
		obj.defaultMethod();
		obj.publicMethod();
	//obj.privateMethod(); we cannot do it since its on other class and is private to demo class.
		obj.protectedMethod();
		
// we can call protected method in other package too the only condition is we have to call it by child class rather than parents class.

}
}