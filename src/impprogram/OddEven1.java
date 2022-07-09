package impprogram;

import java.util.Scanner;

public class OddEven1 {
	
	
	
	
	public static void main(String[] args) {
		
		int a=17;
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd number");
		}

		int n;
		System.out.println("Enter value");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd Number");
		}
		
		
	}

}
