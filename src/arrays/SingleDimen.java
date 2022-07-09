package arrays;

public class SingleDimen {

	
	
	
	public static void main(String[] args) {
	
		
		int a[]=new int[5];       //dyanamic array
		char ch[]=new char[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		ch[4]='a';
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);	
		}
		
		for(int j=0;j<a.length;j++) {
			
		}
		
		System.out.println(a.length);
		System.out.println(ch.length);
		
		System.out.println(a[0]);
		System.out.println(ch[1]);
		
		
		

	}

}
