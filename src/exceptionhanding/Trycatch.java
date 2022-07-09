package exceptionhanding;

public class Trycatch {

	public static void main(String[] args) {
		
		
		
		try {
			System.out.println("Hello"); //statement 1
			int a=20,b=0,c;    //exception
			c=a/b;
			
		System.out.println(c);  // statement 2
		System.out.println("Java");
		}
		catch(ArithmeticException e) {
			System.out.println("java");
			
		}
		System.out.println("money");
		
	}

}
