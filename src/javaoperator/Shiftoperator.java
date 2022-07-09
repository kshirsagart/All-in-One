package javaoperator;

public class Shiftoperator {
	
	static void money() {
		System.out.println(10<<2);  //10*2^2=40
	}

	public static void main(String[] args) {
		 
		money();
		
		//left shift
		System.out.println(10<<3); // 10*2^3=10*8=80
        
		
		//right shift
		System.out.println(10>>3);  // 10/2^3=10/8=1
	}

}
