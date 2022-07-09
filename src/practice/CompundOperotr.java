package practice;

public class CompundOperotr {

	public static void main(String[] args) {
		
		int a=10;
		
		a+=10;  //a=a+10=20
		System.out.println(a);
		
		a-=5;  // a=a-5=15
		System.out.println(a);
		
		a*=2;   // a=a*2=30
		System.out.println(a);
		
		
		a/=2;   //a=a/2=15
		System.out.println(a);
		
		a%=2;  // a=a%2=1
		System.out.println(a);
		
		int b=17;
		int c=17;
		
		b &=10;   //  10001
		          //   1010
		          //  00000
		System.out.println(b);
		
		c|=10;   // 10001
				//   1010
				// 11011
		System.out.println(c);
		
		c^=10;  // 11011
		       //   1010
		       //  10001
		System.out.println(c);
		
		
		c<<=2; // 17*2^2 =17*4=68
		System.out.println(c);
		
		c>>=2; // 68/2^2=68/4=17
		System.out.println(c);
		
		
		

	}

}
