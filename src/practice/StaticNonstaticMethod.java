package practice;

public class StaticNonstaticMethod {

	int a=20,b=10;
	
	static void main() {    //in static method variable are declare inside a  method body
		int a=20,b=10;
		System.out.println(a+b);
	}
	
	void show() {               // non static method
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
		StaticNonstaticMethod obj=new StaticNonstaticMethod();
		
		main();  // static method loading directly
		
		obj.show();  // non static method loading with object

	}

}
