package news;

public class Palindrom {

	public static void main(String[] args) {
		
		int n=121;
		int c=n;
		int r,s=0;
				
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if (c==s) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("non palindrom");
		}

	}

}
