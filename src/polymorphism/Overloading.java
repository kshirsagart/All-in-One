package polymorphism;

public class Overloading {
	
	void main() {
		System.out.println("hello");
	}
	
	void main(int i,int j) {
		System.out.println(i+j);
		
	}
	
	void main(long i,int j) {
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		Overloading a=new Overloading();
		a.main();
		a.main(10, 10);
		a.main(50, 50);
		
		

	}

}
