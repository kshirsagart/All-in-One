package practice;

class Parent1{
	
	int a=50,b=20;
	void main() {
		System.out.println(a+b);
	}
}
class Chield1 extends Parent1{
	
	void money() {
		System.out.println(a-b);
	}
}
class Chield2 extends Chield1{
	
	void bank() {
		System.out.println(a*b);
	}
}	
class Chield3 extends Chield2{
	
	void cash() {
		System.out.println(a/b);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Chield3 obj=new Chield3();
		obj.main();
		obj.bank();
		obj.cash();
		obj.money();
		

	}

}















