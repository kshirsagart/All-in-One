package exceptionhanding;

public class ReturnType {
	
	static int Print() {
		try {
			System.out.println("Try");
			System.out.println(10/0);
			return 50;
		}catch(Exception e) {
			System.out.println("catch");
			return 20;
		}finally {
			System.out.println("finally");
			return 30;
		}
	}

	static int Print1() {
		try {
			System.out.println("Try");
			System.out.println(10/0);
			return 50;
		}catch(Exception e) {
			System.out.println("catch");
			return 20;
		}finally {
			System.out.println("finally");
			
		}
	}
	
	static int Print2() {
		try {
			System.out.println("Try");
			System.out.println(10/2);
			return 50;
		}catch(Exception e) {
			System.out.println("catch");
			return 20;
		}finally {
			System.out.println("finally");
			
		}
	}
	public static void main(String[] args) {
		System.out.println(Print( ));
        System.out.println(Print1());
        System.out.println(Print2());
	}

}
