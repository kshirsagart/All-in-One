package impprogram;     // prime number means  the number which is divisible by 1 and itself

public class PreimeNumber3 {

	public static void main(String[] args) {
		
		int a=7,count=0;
         
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("prime number");
			}else {
				System.out.println("Not prime number");
			}
		}
	}


