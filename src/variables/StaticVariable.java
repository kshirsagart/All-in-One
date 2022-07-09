package variables;

public class StaticVariable {
  // the variable which is declared with the help of static keyword is called static variable
	//static variable load with class file
	//without creating object we can execute the variable
	static int i=20;  // initialisation
	static int j;    // declaration
	
	
	public static void main(String[] args) {
	
		StaticVariable aa=new StaticVariable ();
		
		
		
		
		System.out.println(i);  // static variable calling directly
		System.out.println(StaticVariable.i);  // static variable calling with class file
		System.out.println(aa.i);    // static variable calling with object
		
		j=50;
		aa.j=50;
		System.out.println(j);

	}

}
