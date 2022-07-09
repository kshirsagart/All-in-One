package practice;

public class IncrementDecrementOpreator {

	public static void main(String[] args) {
		
		int a=10,b=10;
		//post increment
		System.out.println(a++);   // 10(10+1)
		System.out.println(b++);   //10(10+1)
		System.out.println(a);     //11
		System.out.println(b);     //11
		
		//pre increment
		System.out.println(++a); //12
		System.out.println(++b); //12
		System.out.println(a);   //12
		System.out.println(b);   //12
        
		//post decrement
		System.out.println(a--); //12(12-1)
		System.out.println(b--);  //12(12/1)
		System.out.println(a);   // 11
		System.out.println(b);   //11
		
		// pre decrement 
		System.out.println(--a);   // 10
		System.out.println(--b);  //10
		System.out.println(a);   //10
		System.out.println(b);   //10
		
		
		System.out.println(a++ + b++ + b + a + ++a + ++b + b-- + a-- );
		//10+10+11+11+12+12+12+12
	}

}
