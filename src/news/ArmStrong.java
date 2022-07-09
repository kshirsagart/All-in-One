package news;  //153=1*1*1+5*5*5+3*3*3=1+125+27=153

public class ArmStrong {

	public static void main(String[] args) {
	
		int n=153;
		int c,r,s=0;
		c=n;
		
		while(n>0) {
			r=n%10;
			s=(r*r*r)+s;
			n=n/10;
		}
		if(c==s) {
			System.out.println("Armstrong");
		}
		else {
	     System.out.println(" not Armstrong");
		}

	}

}
