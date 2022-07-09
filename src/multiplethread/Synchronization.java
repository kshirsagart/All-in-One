package multiplethread;

class Printing{
	
	 synchronized void print(char ch) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
class AAA extends Thread{
	
	Printing P;
	AAA(Printing P){
		this.P=P;
	}
	public void run() {
		P.print('*');
	}
}
class BAC extends Thread{
	
	Printing P;
	BAC(Printing P){
		this.P=P;
	}
	public void run() {
		P.print('#');
	}
}




public class Synchronization {

	public static void main(String[] args) {
	Printing aa=new Printing();
	AAA t1=new AAA(aa);
	BAC t2=new BAC(aa);
	
    t1.start();
    t2.start();
	

	}

}
