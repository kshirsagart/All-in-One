package typecasting;

public class Explicity {

	public static void main(String[] args) {
		
		double a=20;  //8 byte
	//	int b=a;        //4  byte
     
		int b=(int)a;
		System.out.println(b);
	}

}
