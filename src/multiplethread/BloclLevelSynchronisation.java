package multiplethread;

class Parent{
	
	 void print(char ch) {
		 synchronized(this) {
			 
		 
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
}
class BA extends Thread{
	
	Printing P;
	BA(Printing P){
		this.P=P;
	}
	public void run() {
		P.print('*');
	}
}
class BC extends Thread{
	
	Printing P;
	BC(Printing P){
		this.P=P;
	}
	public void run() {
		P.print('#');
	}
}




public class BloclLevelSynchronisation {

	public static void main(String[] args) {
	Printing aa=new Printing();
	BA t1=new BA(aa);
	BC t2=new BC(aa);
	
   t1.start();
   t2.start();
	

	}

}

