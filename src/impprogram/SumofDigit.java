package impprogram;  //     123=1+2+3=6

public class SumofDigit {

	public static void main(String[] args) {
		
		int n=123,sum=0;
		
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
System.out.println(sum);
	}

}
