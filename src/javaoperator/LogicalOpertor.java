package javaoperator;

public class LogicalOpertor {

	public static void main(String[] args) {
		
		boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean d=false;
        
        // and operator &&
        
        System.out.println(a && b); // false   // true true=true
        System.out.println( a && c); //true
        System.out.println(a && d);  //false
        System.out.println(b && d);  //false
        
        
        // or operator  ||
        
        System.out.println(a || b); // true
        System.out.println( a || c); //true   // false false =false
        System.out.println(a || d);  //true
        System.out.println(b || d);  //false
        
        // explosive or ^
        System.out.println(a  ^ b); // true
        System.out.println( a ^ c); //false   // true true=false
        System.out.println(a ^ d);  //true    // false false=false
        System.out.println(b  ^d);  //false
        
        
	}

}
