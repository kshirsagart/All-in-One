package practice;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		
     int marks=80;
		
		if(marks>=80) {
			System.out.println("Topper");
		}else if(marks<80 && marks>=60) {
			System.out.println("Second");
		}else {
			System.out.println("Third");
		}
		
		
		int n;
		System.out.println("Enter number");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		if(n>80) {
			System.out.println("Topper");
		}else if(80<n && 80>=n) {
			System.out.println("Second");
		}else {
			System.out.println("Third");
		}
		
		
		

	}

}
