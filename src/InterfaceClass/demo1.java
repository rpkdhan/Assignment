package InterfaceClass;

// interface if there class mentioned then we have to replace it by interface
// or we call directly link to interface which is in demo 2
// this is a reformed version of abstract form. where we cannot use any body apart from abstract.
// we cannot make constructor of an interface.

public /*abstract is default */interface /* in place of class we use interface*/ demo1 {

	//void m1();
	//public void m2();
	//abstract void m3();
	public abstract void m4();// by default. and all above are same.
	
	int a = 5; // here varaible will be constant by default.
	public static final int a2= 5; // default form.
}
