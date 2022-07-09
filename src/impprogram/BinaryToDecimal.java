package impprogram;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int n=1010;
		int r,d=0,base=1;
		
		while(n>0) {
			
			r=n%10;
			d=(d)+(r*base);
			n=n/10;
			base=base*2;
			
		}
		System.out.println(d);

	}

}
