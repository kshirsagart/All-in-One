package multiplethread;

public class JoinMethod extends Thread {

	@Override
	 public void  run() {
		 
		 for(int i=0;i<3;i++) {
			 System.out.println(Thread.currentThread().getName()+" "+ i);
			 
		 }
			 
	 
	
	 }
		
	
	public static void main(String[] args) throws InterruptedException{
	    JoinMethod t1=new JoinMethod();
	    JoinMethod t2=new JoinMethod();
	    JoinMethod t3=new JoinMethod();
	    
	    t1.setName("Thread1");
	    t2.setName("Thread2");
	    t3.setName("Thread3");
	    
	    t1.start();
	    t1.join();
	    t1.sleep(3000);
	    t2.start();
	  
	    
	    t3.start();

	}

}
