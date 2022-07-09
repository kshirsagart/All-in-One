package variables;

public class Instancevariable {
// the variable which is declared inside class and outside method is called instance cariable
	// instance variable calling with object
	
	int a=20;  // intitialisation
	int b;    // declaration
	
	
	public static void main(String[] args) {
		Instancevariable aa=new Instancevariable();  // create object for class
		System.out.println(aa.a);    // instance variable calling with object
		
		
		aa.b=50;    // intialisation
        System.out.println(aa.b);		   // instace variable calling with object
		

	}

}
