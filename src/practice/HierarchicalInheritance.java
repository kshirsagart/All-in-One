package practice;

class Parents1{
	int a=20,b=30;
	void main() {
		System.out.println(a+b);
	}
}
class Chields1 extends Parents1{
	
	void show() {
		System.out.println(a-b);
	}
}
class Chields2 extends Parents1{
	
	void bank() {
		System.out.println(a*b);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Chields2 obj=new Chields2();
		obj.main();
		obj.bank();
	//  obj.show();

	}

}






