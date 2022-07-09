package methods;

public class NonstaticMethod {
  //the method which is  declarared without static keyword is called instance method
	// instance method calling with object
	
	void bank() {
		System.out.println("Akash");
	}
	
	void money() {
		System.out.println("tushar");
	}
	
	
	public static void main(String[] args) {
		
		NonstaticMethod  aa=new NonstaticMethod ();
		
		aa.bank();   // method runs only when called
		aa.money();
		
	

	}

}
