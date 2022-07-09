package practice;

public class LogicalOperator {


	public static void main(String[] args) {
           
		boolean a=true;
		boolean b=false;
		boolean c=true;
		boolean d=false;
		
		// and operator (true true=true)
		System.out.println(a && b);   // false
		System.out.println(a && c);   // true
		System.out.println(a && d);   //false
		System.out.println(b && d);   // false
		
		// or operator(false false =false)
		System.out.println(a || b);   // true
		System.out.println(a || c);   //  true
		System.out.println(a || d);   // true
		System.out.println(b || d);   // false
		
		// ^ operator(false false =false)
		 //(true true =false)
				System.out.println(a ^ b);   // true
				System.out.println(a ^ c);   //  false
				System.out.println(a ^ d);   // true
				System.out.println(b ^ d);   // false
	}

}
