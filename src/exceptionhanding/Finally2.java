package exceptionhanding;

public class Finally2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello java");
			int a=20,b=2,c;
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("all is clear");
		}finally {
			System.out.println("main method end");
		}

	}

}
