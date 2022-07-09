package javaoperator;

public class CompundAssopt {

	public static void main(String[] args) {
		int a=10;
		
		a +=10;  //a=a+10=20
		System.out.println(a);
		
		a-=5;   // a=a-5=15
		System.out.println(a);
		
		a *=2;  //a=a*2=30
		System.out.println(a);
		
		a/=2;  //a=a/2=15
		System.out.println(a);
		
		a%=2;  //a=a%2=1
		System.out.println(a);
		
		
		int i=10;
		
		i &=15;   //    1010
		          //    1111
		        //  ==    1010 =10
		System.out.println(i);
		
		i |=15;   //  1010
		          //  1111
		          //==1111  =15
		System.out.println(i);
		
		i^=15;   // 1111
		         // 1111
		         // 0000   =0
		System.out.println(i);

		int j=10;
		j <<=3; //     j=j<<3=10*2^3=80
		System.out.println(j);
		
		
		j>>=2;  //j=j>>2=80/2^2=20
		System.out.println(j);
		
		
	}

}
