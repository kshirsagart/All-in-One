package thread;

public class RunnaleInterface  implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Thread"+i);
			
			
			
		}
		
	}
	

	public static void main(String[] args) {
		RunnaleInterface aa=new RunnaleInterface();
		Thread t1=new Thread(aa);
		Thread t2=new Thread(aa);
		Thread t3=new Thread(aa);
		
		t1.start();
		t2.start();
		t3.start();

		

	}

	

}
