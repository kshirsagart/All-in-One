package practice;

public class SingleDArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a.length);
		System.out.println(a.equals(a));
		System.out.println(a[0]==20);
  
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
			for(int b:a) {
				System.out.println("Count"+" "+b);
			}
			
			
			char ch[]= {30,35,40,45,50};
			System.out.println(ch.length);
			
			for(int j=0;j<a.length;j++) {
				System.out.println(ch[j]);
			}
			for(int d:ch) {
				System.out.println(d);
			}
		}

	}

}
