package practice;      // 0 1 1 2 3 5 8 13

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a=50,b=10,c=30;
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else {
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


