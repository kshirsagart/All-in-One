package exceptionhanding;

public class MultipleTryCatch {

	static void main() {
		try {
			System.out.println("Try 1");
		try {
			System.out.println(10/0);
		try {
			System.out.println("Try 3");
		}catch(Exception e) {
			System.out.println("catch 3");
		}
			
			
		}catch(Exception e) {
			System.out.println("catch 2");
		}
			
		}catch(Exception e) {
			System.out.println("catch 1");
		}
	}
	
	
	public static void main(String[] args) {
		main();
		

	}

}
