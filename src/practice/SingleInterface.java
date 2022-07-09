package practice;

interface Parent11{
	int a=50,b=30;
	void input();
	void output();
	
}
class Chield4 implements Parent11{

	@Override
	public void input() {
		System.out.println(a+b);
		System.out.println(a*b);
	}

	@Override
	public void output() {
		System.out.println(a-b);
		System.out.println(a/b);
		
	}
}	
public class SingleInterface {

	public static void main(String[] args) {
		
		Chield4 obj=new Chield4();
		obj.input();
		obj.output();
		

	}

}






