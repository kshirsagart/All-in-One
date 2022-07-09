package selectionstatemnt;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a=10,b=20,c=30;   //largest values between 3 number
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}

	}

}
