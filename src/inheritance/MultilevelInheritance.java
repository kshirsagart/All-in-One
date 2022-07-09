package inheritance;

class A{
	int a=20;
	void main() {
		System.out.println(a);
	}
}
class B extends A{
	
	B(){
		System.out.println("Hello");
	}
	
	int b=50;
	void display() {
		System.out.println(a+b);
	}
}

class C extends B{
	int c=80;
	void cash() {
		System.out.println(a+b+c);
	}
	
}
public class MultilevelInheritance {
public static void main(String[] args) {
        
	C a=new C();
	a.cash();
	a.display();
	a.main();
 
	}

}
	
	
	
	









