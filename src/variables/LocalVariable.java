package variables;

public class LocalVariable {
	// variable are declared inside a method body or method parameter is caled local variable
	// local variable calling direcly but method runs only when called
	
	void main () {
		int b=20;     //local variable
System.out.println(b);


	}
	
	void show(int a) {   // local variable
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		
		
		LocalVariable aa=new LocalVariable();

		
		aa.main();  // method call
		aa.show(50);  // method call
	}

}
