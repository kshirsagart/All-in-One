package practice;

class Parent111{
	
	int a=20,b=10;
	void show() {
		System.out.println("hello"+" "+a*b);
	}
}
class Chield11 extends Parent111{
	
	int i=50,j=40;
	void main() {
		System.out.println("java"+" "+ i*j);
	}
}
public class Upcasting {

	public static void main(String[] args) {
		
		Parent111 obj=new Chield11();  //upcasting
		obj.show();
		
		

	}

}





