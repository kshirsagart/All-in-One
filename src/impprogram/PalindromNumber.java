package impprogram;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int n=121;
		int c=n,r,s=0;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(c==s) {
			System.out.println("Palindrom number");
		}
		else {
			System.out.println("non palindrom number");
		}
	}

}
