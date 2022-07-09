package practice;

abstract class parent{
	int a=50,b=20;
	void main() {
	
		System.out.println(a+b);
	}
	abstract void show();
}

class chield extends parent{

	@Override
	void show() {
		System.out.println(a/b);
		
	}
	
	@Override
	void main() {
		System.out.println(a*b);
	}
}	
public class AbstractClass {

	public static void main(String[] args) {
	
		chield obj=new chield();
		obj.show();
		obj.main();

		parent obj1=new chield();
		obj.show();
		obj.main();
	}

}	











