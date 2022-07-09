package inheritance;

class Parent{
	int a=20;
	void main() {
		System.out.println("Hello java");
		System.out.println(a);
	}
	
}
class Chield extends Parent{    // Is A Relationship
	
	int b=20;
	void display() {
		System.out.println(a+b);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Chield a=new Chield();
		a.display();
		a.main();

		Parentsss ab=new Parentsss();   // has a Relationship
		ab.show();
		
	}

}










