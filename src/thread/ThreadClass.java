package thread;

public class ThreadClass extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Thread"+i);
		}
	}

	public static void main(String[] args) {
	  
		ThreadClass t1= new ThreadClass ();
		ThreadClass t2= new ThreadClass ();
		ThreadClass t3= new ThreadClass ();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
