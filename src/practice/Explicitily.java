package practice;

public class Explicitily {

	public static void main(String[] args) {
		
		double a=20;   // 8 byte
//		int b=a;      // 4 byte
		int b=(int)a;   // explicity
		System.out.println(b);

	}

}
