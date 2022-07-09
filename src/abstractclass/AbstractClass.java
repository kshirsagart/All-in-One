package abstractclass;

abstract class Parent1{
	
	int a=10,b=20;
	abstract void input();
	abstract void cash();
	void money() {
		System.out.println(a+b);
	}
}	
class Chield extends Parent1{

	@Override
	void input() {
		System.out.println(a-b);
		
		
		
	}

	@Override
	void cash() {
		// TODO Auto-generated method stub
		
	}
}	
public class AbstractClass {

	public static void main(String[] args) {
	
		Chield a=new Chield();
		a.input();
		a.money();
		a.cash();
		
		Parent1 b=new Chield();
		b.input();
		b.money();
		b.cash();

	}

}






