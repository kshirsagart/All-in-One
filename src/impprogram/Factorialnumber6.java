package impprogram;    // factorial number= 5 =5*4*3*2*1=120

import java.util.Scanner;

public class Factorialnumber6 {

	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact *i;
		}
		System.out.println(fact);
		
		
		int a;
		int factor=1;
		System.out.println("Enter number");
		Scanner ab=new Scanner(System.in);
		a=ab.nextInt();
		
		for(int i=1;i<=a;i++) {
			factor=factor * i;
		}
        System.out.println(factor);
	}

}
