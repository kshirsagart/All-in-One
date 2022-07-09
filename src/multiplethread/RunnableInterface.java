package multiplethread;

class A implements Runnable{

	@Override
	public void run() {
	
		for(int i=0;i<=10;i++) {
			System.out.println("Akash");   //chield thread
		}
		
	}
}	
	
public class RunnableInterface {

	public static void main(String[] args) {   //main thread
		
		A r=new A();           //class object
		Thread t=new Thread(r);  // thread object 
       t.start();             // start method only in thread class
       
       for(int i=0;i<=10;i++) {
    	   System.out.println("Vishal");
       }
	}

}














