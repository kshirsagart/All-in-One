package practice;

public class VoidNonVoidMethod {

	void main() {              // void method
	    int a=20,b=10;
	    System.out.println(a+b);
	}
	
	
	int show() {      // non void method
		int i=20,j=30;
		System.out.println(i+j);
		return 50;
		
		
	}
	
	
	public static void main(String[] args) {
		VoidNonVoidMethod obj=new VoidNonVoidMethod();
		
		obj.main();
		
		obj.show();
		

	}

}
