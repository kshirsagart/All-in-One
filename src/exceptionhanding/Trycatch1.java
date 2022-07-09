package exceptionhanding;

public class Trycatch1 {

	public static void main(String[] args) {
		
		String ss=null;
		try {
		System.out.println(ss.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("null not accept");
		}
	}

}
