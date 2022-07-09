 package impprogram;   // 0 1 1 2 3 5 8 13  

import java.util.Scanner;

//fibonacci series means addition of last two number and get next number


public class FibonacciSerries8 {
	

     public static void main(String[] args) {
		
		int n=8,a=0,b=1,c;
		
	for(int i=0;i<n;i++) {
		System.out.print("" +" "+a);
		c=a+b;
		a=b;
		b=c;
	}

	
	int aa;
	int ab=0;
	int bc=1;
	int cc;
	
	System.out.println("Enter number");
	Scanner A=new Scanner(System.in);
	aa=A.nextInt();
	
	for(int j=0;j<=aa;j++) {
		System.out.print(""+ "  "+ ab);
		cc=ab+bc;
		ab=bc;
		bc=cc;
	}
	

     }
}