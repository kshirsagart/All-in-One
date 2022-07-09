package arrays;

public class MultiDimen {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};    // static array
		char b[]= {'a','b','c','d','e'};
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(a.equals(b));
		System.out.println(a.clone());
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		

	}

}
