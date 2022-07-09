package exceptionhanding;

public class Throw1 {
	
	static void age(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible for vote");
		}
		else {
			System.out.println("Elogible for vote");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		int age1=17;
		if(age1<=18) {
			throw new ArithmeticException("Not eligible for vote");
		}else
			System.out.println("Eligible for vote");
		
		
		age(17);

	}

}
