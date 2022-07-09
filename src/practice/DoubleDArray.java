package practice;

public class DoubleDArray {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
			System.out.println(a[i][j]);
		}
		
		int b[][]= {{25,50,75},{100,125,150},{175,200,225}};
				
		System.out.println(b.length);
		
		for(int m=0;m<b.length;m++) {
			for(int n=0;n<b.length;n++) {
				System.out.println(b[m][n]);
			}
		}
		
		

	}

}
