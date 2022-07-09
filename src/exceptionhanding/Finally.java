package exceptionhanding;

public class Finally {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			try {
			
			Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println("sleep methods is throw check exception");
			}finally {
				System.out.println(i);
				System.out.println("main method end");
			}
		}

	}

}
