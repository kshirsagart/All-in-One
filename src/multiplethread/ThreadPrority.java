package multiplethread;

class AA extends Thread{
	
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class BB{
	
}
public class ThreadPrority {

	public static void main(String[] args) {
		AA t1=new AA();
		AA t2=new AA();
		AA t3=new AA();
		
		
		t1.setName("Akash");
		t2.setName("Tushar");
		t3.setName("Ravi");
		
		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
















