package multiplethread;

public class Daemon extends Thread {
                
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		System.out.println(Thread.currentThread().getName()+ ""+i);
		System.out.println(Thread.currentThread().isDaemon());
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		
	}


	public static void main(String[] args) throws InterruptedException {
		
		Daemon t1=new Daemon();
		Daemon t2=new Daemon();
		Daemon t3=new Daemon();
		
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		System.out.println(t1.isAlive());
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread 3");
				
	
		
	
	
	
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
	}
}
