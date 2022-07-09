package multiplethread;

public class Yield extends Thread {
	
	@Override
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+i);
			Thread.yield();
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
       Yield t1=new Yield();
       Yield t2=new Yield();
       Yield t3=new Yield();
       
       t1.setName("Thread1");
       t2.setName("Thread2");
       t3.setName("Thread3");
       
       t1.start();
       t1.yield();
       t2.start();
       t3.start();
       
       
       for(int i=0;i<3;i++) {
    	   System.out.println(Thread.currentThread().getName()+" "+i);
       }
       
	}

}
