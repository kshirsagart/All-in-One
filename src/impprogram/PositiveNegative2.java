package impprogram;

import java.util.Scanner;

public class PositiveNegative2 {

	public static void main(String[] args) {
		
		int a=-20;
		if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number"); 
			
		}
		
		int n;
		System.out.println("Enter number");
		Scanner ab=new Scanner(System.in);
		n=ab.nextInt();
		
		if(n>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}

	}

}
