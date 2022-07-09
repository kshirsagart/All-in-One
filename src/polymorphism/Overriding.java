package polymorphism;

class A{
	int a;
	int b;
	void main() {
		System.out.println(a+b);
	}
}

class B extends A{
	
	int j=10,k=10;
	@Override
	void main() {
		System.out.println(a*b);
	}
}


public class Overriding {

	public static void main(String[] args) {
	       B a=new B();
	      
	       a.a=10;
	       a.b=20;
	       a.main();
	       
	       A b=new B();
	       
	       b.a=10;
	       b.b=20;
	       a.main();
	       System.out.println(b.a);
	       System.out.println(b.b);
		

	}

}
