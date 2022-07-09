package impprogram;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int n=10;
		int r,b=0,base=1;
		
		while(n>0) {
			
			r=n%2;
			b=b+r*base;
			n=n/2;
			base=base*10;
			
		}
      System.out.println(b);
	}

}
