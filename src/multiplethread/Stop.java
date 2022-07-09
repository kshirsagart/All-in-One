package multiplethread;

public class Stop implements Runnable{

	

	@Override
	public void run() {
		   for(int i=0;i<3;i++) {
			   System.out.println(Thread.currentThread().getName());
			
		   }
		
	}
		public static void main(String[] args) {
			
			Stop r=new Stop();
			Thread t=new Thread(r);
			Thread t1=new Thread(r);
			Thread t2=new Thread(r);
			
			t.setName("Thread1");
			t1.setName("Thread2");
			t2.setName("Thread3");
			
			
			
			t.start();
			t1.stop();
			t2.start();
			System.out.println(t1.isAlive());
			System.out.println(t.isAlive());
			
			}

	}


	
	

