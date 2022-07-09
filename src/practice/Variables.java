package practice;

public class Variables {

	int a=20;       // instance variable
	
	static int b=10;    // static variables
	
	void show() {              // local variable inside method body
		System.out.println(a+b);
	}
	
	void main(int i) {        // local variable inside method parameter
		System.out.println(i+a);
	}
	
	
	public static void main(String[] args) {
        Variables obj=new Variables();
        System.out.println(obj.a);  // instance variable loading with object reference
        
        System.out.println(b);   // static variable loading with directly
        System.out.println(obj.b); // static variable loading with object reference
        System.out.println(Variables.b); // static variable loading with class file
		
        obj.show();  // local variable loading directly..but method runs when we called
        obj.main(10);   //local variable loading directly..but method runs when we called
        

	}

}
