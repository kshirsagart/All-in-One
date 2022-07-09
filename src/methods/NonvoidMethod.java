package methods;

public class NonvoidMethod {

	int money() {
		System.out.println("akash");
		return 10;
	}
	
	static int bank() {
		System.out.println("tushar");
		return 50;
	}
	
	public static void main(String[] args) {
		
		NonvoidMethod a=new NonvoidMethod();
		
		a.money();
		bank();

	}

}
