package typecasting;

class Parent{
	
	int a=20,b=30;
	void main() {
		System.out.println(a+b);
	}
}

class Chield extends Parent{
	
	int j=20;
	int k=10;
	void show() {
		System.out.println(a-b);
	}
}



public class Upcasting {

	public static void main(String[] args) {

		Parent a=new Chield();  // upcasting by
		a.main();
		
		
	//	Chield b=new Parent();
		
		Chield b=(Chield)a;  // downcasting
		
		b.main();
		b.show();
        
        

	}

}
