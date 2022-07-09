package multiplethread;

public class Sleep extends Thread{
	
	  @Override
	  public void run() {
		  for(int i=0;i<3;i++) {
			  System.out.println(Thread.currentThread().getName()+" "+i);
		  }
	  }

	public static void main(String[] args) throws InterruptedException {
		
		Sleep t1=new Sleep();
		Sleep t2=new Sleep();
		Sleep t3=new Sleep();
		
		
		
		t1.setName("thread1");
				t2.setName("thread2");
						t3.setName("thread3");
						
			
						t1.start();
						t1.sleep(3000);
						t2.start();
						t1.sleep(1000);
						t3.start();
	}

}
