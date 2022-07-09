package practice;

public class NestedForLoop1 {

	public static void main(String[] args) {
		
		for(int i=1;i<3;i++) {
			for(int j=1;j<2;j++) {
				System.out.println(i+ "  "+j);
			}
			System.out.println();
		}

		
		
		for(int a=1;a<=10;a++) {
			for(int b=1;b<=10;b++) {
				System.out.print(a*b+ "  ");
			}
			System.out.println();
		}
	}

}
