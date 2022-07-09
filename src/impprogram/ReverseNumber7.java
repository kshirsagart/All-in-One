package impprogram;      //         reverse number=123=321  

import java.util.Scanner;

public class ReverseNumber7 {

	public static void main(String[] args) {
		
		int n=123456;
		int r;
		
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		System.out.println();
		
		int a;
		 int rev;
		 
		 System.out.println("Enter number");
		 Scanner ab=new Scanner(System.in);
		 a=ab.nextInt();
		 
		 while(a>0) {
			 rev=a%10;
			 System.out.print(rev);
			 a=a/10;
		 }
	}

}
